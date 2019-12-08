package top.aiplant.service;

import top.aiplant.entity.TbLed;
/**
 * @ClassName: LedService  
 * @Description: LED灯相关操作接口的定义 
 * @author: YiYChao
 * @date 2019年10月23日 下午7:51:51
 */
public interface LedService {

	/**
	 * @Title: insertLED
	 * @Description: 新增一条LED灯工作状态记录
	 * @param: led LED灯状态
	 * @return: void 空
	 * @throws: null
	 * @date: 2019年10月23日 下午7:52:49
	 */
	public void insertLED(TbLed led);
}
