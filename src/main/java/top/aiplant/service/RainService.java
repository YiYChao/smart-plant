package top.aiplant.service;

import top.aiplant.entity.TbRain;

/**
 * @ClassName: RainService  
 * @Description: 定义雨水相关操作接口 
 * @author: YiYChao
 * @date 2019年11月13日 下午3:30:05
 */
public interface RainService {

	/**
	 * @Title: insert2Rain
	 * @Description: 新增雨水湿度记录
	 * @param: rain 雨水实体
	 * @return: void 空
	 * @throws: 无
	 * @date: 2019年11月13日 下午3:30:54
	 */
	public void insert2Rain(TbRain rain);
}
