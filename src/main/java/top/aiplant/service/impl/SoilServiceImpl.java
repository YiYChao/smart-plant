package top.aiplant.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbSoilMapper;
import top.aiplant.entity.TbSoil;
import top.aiplant.service.SoilService;
/**
 * @ClassName: SoilServiceImpl  
 * @Description: 实现土壤相关操作接口 
 * @author: YiYChao
 * @date 2019年11月13日 下午3:27:36
 */
@Service
public class SoilServiceImpl implements SoilService{

	@Autowired
	private TbSoilMapper soilMapper;
	
	@Override
	public void insert2Soil(TbSoil soil) {
		soil.setSoilTime(new Date());
		soilMapper.insert(soil);
	}

}
