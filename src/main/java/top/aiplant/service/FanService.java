package top.aiplant.service;

import top.aiplant.entity.TbFan;

/**
 * @ClassName: FanService  
 * @Description: 定义风扇相关操作接口的定义 
 * @author: YiYChao
 * @date 2019年10月23日 下午7:39:54
 */
public interface FanService {

	/**
	 * @Title: insertFan
	 * @Description: 新增一条风扇工作状态记录
	 * @param: fan 风扇实体
	 * @return: 空
	 * @throws: null
	 * @date: 2019年10月23日 下午7:41:02
	 */
	public void insertFan(TbFan fan);
}
