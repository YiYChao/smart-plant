package top.aiplant.service;

import java.util.List;

import top.aiplant.entity.TbSensor;
/**
 * @ClassName: SensorService  
 * @Description: 定义传感器相关操作 
 * @author: YiYChao
 * @date 2019年10月20日 上午11:27:12
 */
public interface SensorService {

	/**
	 * @Title: findByPlantId  
	 * @Description: 根据植栽的id主键查询其拥有的传感器实体 
	 * @param: plantId 植栽id主键，外键
	 * @return: List<TbSensor> 传感器实体列表
	 * @throws: null
	 * @date: 2019年10月20日 上午11:28:52
	 */
	List<TbSensor> findByPlantId(int plantId);
}
