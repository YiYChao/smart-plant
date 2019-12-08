package top.aiplant.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbDhtMapper;
import top.aiplant.entity.TbDht;
import top.aiplant.entity.TbDhtExample;
import top.aiplant.entity.TbDhtExample.Criteria;
import top.aiplant.service.DHT11Service;

/**
 * @ClassName: DHT11ServiceImpl  
 * @Description: 实现 Service层中定义的接口，即实现DHT11传感器检测数据的读写操作
 * @author: YiYChao
 * @date 2019年10月19日 下午4:54:13
 */
@Service
public class DHT11ServiceImpl implements DHT11Service{

	@Autowired
	private TbDhtMapper dhtMapper;
	
	@Override
	public void insert2Dht(TbDht dht) {
		dht.setDhtTime(new Date());
		dhtMapper.insert(dht);
	}

	@Override
	public List<TbDht> findBySensorId(int sensorId) {
		TbDhtExample example = new TbDhtExample();
		Criteria criteria = example.createCriteria(); 	// 创建查询对象
		criteria.andSensorIdEqualTo(sensorId);	// 设置传感器Id
		List<TbDht> resList = dhtMapper.selectByExample(example);
		return resList;
	}

}
