package top.aiplant.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	@Override
	public PageInfo<List<DetectExecution<TbPump, TbSoil>>> detectByPage(int plantId,int page,int limit) {
		TbSensorExample sensorExample = new TbSensorExample();
		Criteria sensorCriteria = sensorExample.createCriteria();
		sensorCriteria.andPlantIdEqualTo(plantId);
		List<TbSensor> sensorList = sensorMapper.selectByExample(sensorExample);
		
		int pumpId = 0,soilId = 0;
		for (TbSensor sensor : sensorList) {
			if("土壤湿度传感器".equals(sensor.getSensorName())) {
				soilId = sensor.getSensorId();
			}else if("灌溉水泵".equals(sensor.getSensorName())) {
				pumpId = sensor.getSensorId();
			}
		}
		
		List<TbPump> pumpList = pumpMapper.selectPagerBySensorId(pumpId, page, limit);
		
		List<DetectExecution<TbPump, TbSoil>> rstList = new ArrayList<DetectExecution<TbPump,TbSoil>>();
		for (TbPump pump : pumpList) {
			TbSoilExample soilExample = new TbSoilExample();
			top.aiplant.entity.TbSoilExample.Criteria soilCriteria = soilExample.createCriteria();
			soilCriteria.andSensorIdEqualTo(soilId);
			TbSoil soil = new TbSoil();
			if(pump.getPumpStatus() == 1) {
				soilCriteria.andSoilTimeLessThanOrEqualTo(pump.getPumpTime());
				List<TbSoil> soilList = soilMapper.selectByExample(soilExample);
				soil = soilList.get(soilList.size() -1);
			}else {
				soilCriteria.andSoilTimeGreaterThanOrEqualTo(pump.getPumpTime());
				soil = soilMapper.selectByExample(soilExample).get(0);
			}
			DetectExecution<TbPump, TbSoil> record = new DetectExecution<TbPump, TbSoil>(pump, soil);
			rstList.add(record);
		}
		int totle = pumpMapper.selectTotleCount(pumpId);
		
		PageInfo<List<DetectExecution<TbPump, TbSoil>>> result = new PageInfo<List<DetectExecution<TbPump,TbSoil>>>(0, "OK", totle, rstList);
		return result;
	}
}
