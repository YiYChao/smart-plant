package top.aiplant.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbLightMapper;
import top.aiplant.entity.TbLight;
import top.aiplant.service.LightService;
/**
 * @ClassName: LightServiceImpl  
 * @Description: 光照强度相关操作接口实现 
 * @author: YiYChao
 * @date 2019年11月13日 下午3:38:39
 */
@Service
public class LightServiceImpl implements LightService{
	
	@Autowired
	private TbLightMapper lightMapper;
	
	@Override
	public void insert2Light(TbLight light) {
		light.setLightTime(new Date());
		lightMapper.insert(light);
	}

}
