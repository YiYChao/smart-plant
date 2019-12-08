package top.aiplant.service;

import java.util.List;

import top.aiplant.entity.TbDht;

/**
 * 
* @ClassName: DHT11Service  
* @Description: 定义DHT11传感器相关的数据读写接口 
* @author: YiYChao
* @date 2019年10月19日 下午4:47:35
*
 */
public interface DHT11Service {

	/**
	* @Title: insert2Dht  
	* @Description: 新增DHT11检测数据 
	* @param: dht实体
	* @return: void
	* @throws: null
	* @date: 2019年10月19日 下午4:52:56
	 */
	public void insert2Dht(TbDht dht);
	
	/**
	 * @Title: findAll
	 * @Description: 查找所有的记录
	 * @param: sensorId 传感器主键id
	 * @return: List<TbDht>	返回列表集合
	 * @throws: 无
	 * @date: 2019年11月6日 下午7:44:01
	 */
	List<TbDht> findBySensorId(int sensorId);
}
