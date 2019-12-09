package top.aiplant.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import top.aiplant.dao.TbPumpMapper;
import top.aiplant.dao.TbSensorMapper;
import top.aiplant.dao.TbSoilMapper;
import top.aiplant.entity.TbPump;
import top.aiplant.entity.TbSensor;
import top.aiplant.entity.TbSensorExample;
import top.aiplant.entity.TbSensorExample.Criteria;
import top.aiplant.entity.TbSoil;
import top.aiplant.entity.TbSoilExample;
import top.aiplant.pojo.DetectExecution;
import top.aiplant.pojo.PageInfo;
import top.aiplant.service.DetectPumpService;
/**
 * @ClassName: DetectPumpImpl  
 * @Description: TODO 
 * @author: YiYChao
 * @date 2019年11月28日 下午10:47:20
 */
@Service
public class DetectPumpServiceImpl implements DetectPumpService{

	@Autowired
	private TbSensorMapper sensorMapper;
	@Autowired
	private TbPumpMapper pumpMapper;
	@Autowired
	private TbSoilMapper soilMapper;
	@Autowired
	private RedisTemplate redisTemplate;
	
	@SuppressWarnings("unchecked")
	@Override
	public PageInfo<List<DetectExecution<TbPump, TbSoil>>> detectByPage(int plantId,int page,int limit) {
		// 根据盆栽id查找传感器列表
		TbSensorExample sensorExample = new TbSensorExample();
		Criteria sensorCriteria = sensorExample.createCriteria();
		sensorCriteria.andPlantIdEqualTo(plantId);
		List<TbSensor> sensorList = sensorMapper.selectByExample(sensorExample);
		
		//  找到指定盆栽的土壤湿度传感器id和灌溉水泵id
		int pumpId = 0,soilId = 0;
		for (TbSensor sensor : sensorList) {
			if("土壤湿度传感器".equals(sensor.getSensorName())) {
				soilId = sensor.getSensorId();
			}else if("灌溉水泵".equals(sensor.getSensorName())) {
				pumpId = sensor.getSensorId();
			}
		}
		// 构建结果集列表
		List<DetectExecution<TbPump, TbSoil>> rstList = new ArrayList<DetectExecution<TbPump,TbSoil>>();
		System.out.println();
		// 缓存中存在记录
		if(redisTemplate.hasKey(String.valueOf(pumpId))) {
			System.out.println("缓存中有记录，查询缓存。。。");
			Set<DetectExecution<TbPump, TbSoil>> rstSet = redisTemplate.boundZSetOps(String.valueOf(pumpId)).range((page-1)*limit, page*limit - 1);
			rstList = new ArrayList<DetectExecution<TbPump,TbSoil>>(rstSet);
		}else {
			System.out.println("缓存中没有记录，查询数据库。。。");
			// 分页查询水泵工作状态列表
			List<TbPump> pumpList = pumpMapper.selectPagerBySensorId(pumpId, page, limit);
			for (TbPump pump : pumpList) {
				// 查找盆栽对应的土壤湿度记录
				TbSoilExample soilExample = new TbSoilExample();
				top.aiplant.entity.TbSoilExample.Criteria soilCriteria = soilExample.createCriteria();
				soilCriteria.andSensorIdEqualTo(soilId);
				TbSoil soil = new TbSoil();
				// 水泵开启，先检测到湿度
				if(pump.getPumpStatus() == 1) {
					soilCriteria.andSoilTimeLessThanOrEqualTo(pump.getPumpTime());
					List<TbSoil> soilList = soilMapper.selectByExample(soilExample);
					// 取小于水泵开启时间的最后一条记录
					soil = soilList.get(soilList.size() -1);
				}else {
					// 水泵关闭，后检测到湿度
					soilCriteria.andSoilTimeGreaterThanOrEqualTo(pump.getPumpTime());
					// 取大于水泵关闭的第一条记录
					soil = soilMapper.selectByExample(soilExample).get(0);
				}
				// 形成一条结果对象
				DetectExecution<TbPump, TbSoil> record = new DetectExecution<TbPump, TbSoil>(pump, soil);
				rstList.add(record);	// 加入结果列表
				// 加入缓存
				redisTemplate.boundZSetOps(String.valueOf(pumpId)).add(record, pump.getPumpId());
			}
		}
		
		// 查询总记录数
		int totle = redisTemplate.boundZSetOps(String.valueOf(pumpId)).size().intValue();
		
		PageInfo<List<DetectExecution<TbPump, TbSoil>>> result = new PageInfo<List<DetectExecution<TbPump,TbSoil>>>(0, "OK", totle, rstList);
		return result;
	}
}
