package top.aiplant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbSensorMapper;
import top.aiplant.entity.TbSensor;
import top.aiplant.entity.TbSensorExample;
import top.aiplant.entity.TbSensorExample.Criteria;
import top.aiplant.service.SensorService;
/**
 * @ClassName: SensorServiceImpl  
 * @Description: 实现服务层定义的植栽的相关接口 
 * @author: YiYChao
 * @date 2019年10月20日 上午11:31:35
 */
@Service
public class SensorServiceImpl implements SensorService{

	@Autowired
	private TbSensorMapper sensorMapper;
	
	@Override
	public List<TbSensor> findByPlantId(int plantId) {
		TbSensorExample example = new TbSensorExample();
		Criteria criteria = example.createCriteria();
		criteria.andPlantIdEqualTo(plantId);		// 添加查询条件
		List<TbSensor> sensorList = sensorMapper.selectByExample(example);	// 执行查询
		// 查询结果不为空
		if(sensorList != null && sensorList.size() > 0) {
			// 遍历过滤查询结果
//			for (TbSensor tbSensor : sensorList) {
			for(int i = 0; i < sensorList.size(); i++) {
				// 移除未激活的传感器实体
				if(sensorList.get(i).getSensorStatus() == 0) {
//					sensorList.remove(tbSensor);	// 移除元素以后，索引没有对应修改减少，所以会出现空指针异常
					sensorList.remove(sensorList.get(i));	// 移除元素
					i --;	// 删除元素以后，对应的索引也因该修改
				}
			}
		}
		return sensorList;
	}

}
