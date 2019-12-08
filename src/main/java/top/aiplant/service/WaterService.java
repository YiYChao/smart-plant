package top.aiplant.service;

import top.aiplant.entity.TbWater;

/**
 * @ClassName: WaterService  
 * @Description: 定义水位相关操作接口 
 * @author: YiYChao
 * @date 2019年11月13日 下午3:39:59
 */
public interface WaterService {

	/**
	 * @Title: insert2Water
	 * @Description: 新增一条水位记录
	 * @param: water 水位实体
	 * @return: void 空
	 * @throws: 无
	 * @date: 2019年11月13日 下午3:40:46
	 */
	public void insert2Water(TbWater water);
}
