package top.aiplant.service;

import java.util.List;

import top.aiplant.entity.TbPump;
import top.aiplant.entity.TbSoil;
import top.aiplant.pojo.DetectExecution;
import top.aiplant.pojo.PageInfo;

/**
 * @ClassName: DetectPump  
 * @Description: 监测传感器 
 * @author: YiYChao
 * @date 2019年11月28日 下午10:30:01
 */
public interface DetectPumpService {

	/**
	 * @Title: detectByPage
	 * @Description: 监测所有的记录
	 * @param: plantId 盆栽id主键
	 * @param: page 当前页
	 * @param: pageSize 每页记录数
	 * @return: PageInfo<List<DetectExecution<TbPump, TbSoil>>> 自定义分页结构类型
	 * @throws: 无
	 * @date: 2019年11月28日 下午10:33:35
	 */
	public PageInfo<List<DetectExecution<TbPump, TbSoil>>> detectByPage(int plantId,int page,int limit);
}
