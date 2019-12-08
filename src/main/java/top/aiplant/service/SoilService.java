package top.aiplant.service;

import top.aiplant.entity.TbSoil;

/**
 * @ClassName: SoilService  
 * @Description: 定义土壤湿度相关操作接口 
 * @author: YiYChao
 * @date 2019年11月13日 下午3:24:12
 */
public interface SoilService {

	/**
	 * @Title: insertSoil
	 * @Description: 新增土壤湿度记录
	 * @param: soil 土壤实体
	 * @return: void 空
	 * @throws: 无
	 * @date: 2019年11月13日 下午3:25:07
	 */
	public void insert2Soil(TbSoil soil);
}
