package top.aiplant.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbLedMapper;
import top.aiplant.entity.TbLed;
import top.aiplant.service.LedService;
/**
 * @ClassName: LedServiceImpl  
 * @Description: LED灯工作状态接口的实现 
 * @author: YiYChao
 * @date 2019年10月23日 下午7:54:24
 */
@Service
public class LedServiceImpl implements LedService{

	@Autowired
	private TbLedMapper ledMapper;
	
	@Override
	public void insertLED(TbLed led) {
		led.setLedTime(new Date());
		ledMapper.insert(led);
	}

}
