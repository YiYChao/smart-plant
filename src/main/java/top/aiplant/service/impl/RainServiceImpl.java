package top.aiplant.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbRainMapper;
import top.aiplant.entity.TbRain;
import top.aiplant.service.RainService;
/**
 * @ClassName: RainServiceImpl  
 * @Description: 雨水相关操作接口实现 
 * @author: YiYChao
 * @date 2019年11月13日 下午3:33:48
 */
@Service
public class RainServiceImpl implements RainService{

	@Autowired
	private TbRainMapper rainMapper;
	
	@Override
	public void insert2Rain(TbRain rain) {
		rain.setRainTime(new Date());
		rainMapper.insert(rain);
	}

}
