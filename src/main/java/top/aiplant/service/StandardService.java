package top.aiplant.service;

import top.aiplant.entity.TbStandard;
/**
 * @ClassName: StandardService  
 * @Description: 植栽标准相关操作的接口定义 
 * @author: YiYChao
 * @date 2019年10月20日 下午5:00:58
 */
public interface StandardService {
	
	/**
	 * @Title: findByPlantId  
	 * @Description: TODO 
	 * @param: plantId 植栽id，外键 
	 * @return: TbStandard 植栽标准实体
	 * @throws: null
	 * @date: 2019年10月20日 下午5:02:21
	 */
	TbStandard findByPlantId(int plantId);
	
	/**
	 * @Title: setExecution
	 * @Description: 设置盆栽标准的指定参数值
	 * @param: plantId 盆栽id
	 * @param: name 执行器名称
	 * @param: num 数值
	 * @return: void 空
	 * @throws: 无
	 * @date: 2019年12月6日 下午11:44:57
	 */
	void setExecution(int plantId, String name, float num);
}
