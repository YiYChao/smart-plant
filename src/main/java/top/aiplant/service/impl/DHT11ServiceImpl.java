package top.aiplant.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
	@SuppressWarnings("rawtypes")
	@Autowired
	private RedisTemplate redisTemplate;
	
	@SuppressWarnings("unchecked")
	@Override
	public void insert2Dht(TbDht dht) {
		dht.setDhtTime(new Date());
		dhtMapper.insert(dht);
		// 加入缓存
		redisTemplate.boundListOps(dht.getSensorId() + "Date").rightPush(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dht.getDhtTime()));
		redisTemplate.boundListOps(dht.getSensorId() + "Temperature").rightPush(dht.getDhtTemperature());
		redisTemplate.boundListOps(dht.getSensorId() + "Humidity").rightPush(dht.getDhtHumidity());
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
