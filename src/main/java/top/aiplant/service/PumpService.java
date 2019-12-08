package top.aiplant.service;

import top.aiplant.entity.TbPump;
/**
 * @ClassName: PumpService  
 * @Description: 定义水泵相关的操作接口的定义 
 * @author: YiYChao
 * @date 2019年10月23日 下午7:45:41
 */
public interface PumpService {

	/**
	 * @Title: insertPump
	 * @Description: 新增一条水泵状态记录
	 * @param: pump 水泵状态实体
	 * @return: 空
	 * @throws: null
	 * @date: 2019年10月23日 下午7:46:11
	 */
	public void insertPump(TbPump pump);
}
