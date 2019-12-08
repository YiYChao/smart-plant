package top.aiplant.service;

import top.aiplant.entity.TbLight;

/**
 * @ClassName: LightService  
 * @Description: 定义光照强度相关操作接口 
 * @author: YiYChao
 * @date 2019年11月13日 下午3:35:44
 */
public interface LightService {

	/**
	 * @Title: insert2Light
	 * @Description: 新增一条光照强度记录
	 * @param: light 光照强度实体
	 * @return: void 空
	 * @throws: 无
	 * @date: 2019年11月13日 下午3:36:42
	 */
	public void insert2Light(TbLight light);
}
