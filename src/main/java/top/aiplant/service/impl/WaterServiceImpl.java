package top.aiplant.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbWaterMapper;
import top.aiplant.entity.TbWater;
import top.aiplant.service.WaterService;
/**
 * @ClassName: WaterServiceImpl  
 * @Description: 实现水位相关操作接口 
 * @author: YiYChao
 * @date 2019年11月13日 下午3:41:46
 */
@Service
public class WaterServiceImpl implements WaterService{

	@Autowired
	private TbWaterMapper waterMapper;
	
	@Override
	public void insert2Water(TbWater water) {
		water.setWaterTime(new Date());
		waterMapper.insert(water);
		
	}

}
