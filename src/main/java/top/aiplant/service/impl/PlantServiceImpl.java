package top.aiplant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbPlantMapper;
import top.aiplant.entity.TbPlant;
import top.aiplant.entity.TbPlantExample;
import top.aiplant.entity.TbPlantExample.Criteria;
import top.aiplant.service.PlantService;
/**
 * @ClassName: PlantServiceImpl  
 * @Description: 实现植栽接口，完成植栽相关的操作 
 * @author: YiYChao
 * @date 2019年10月20日 上午10:33:16
 */
@Service
public class PlantServiceImpl implements PlantService{

	@Autowired
	private TbPlantMapper plantMapper;
	
	@Override
	public int findIdByToken(String token) {
		TbPlantExample example = new TbPlantExample();
		Criteria criteria = example.createCriteria();	// 创建查询对象
		criteria.andPlantTokenEqualTo(token);			// 设置查询条件
		List<TbPlant> res = plantMapper.selectByExample(example);	// 执行查询，获得查询结果
		// 判断查询结果是否为空
		if(res != null && res.size() > 0) {
			// 植栽处于激活状态
			if(res.get(0).getPlantStatus() == 1) {
				return res.get(0).getPlantId();		// 取出第一个查询结果的id值并返回
			}
		}
		return 0;	// 没有查询到则返回0
	}
}
