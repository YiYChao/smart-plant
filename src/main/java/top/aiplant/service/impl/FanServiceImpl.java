package top.aiplant.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbFanMapper;
import top.aiplant.entity.TbFan;
import top.aiplant.service.FanService;
/**
 * @ClassName: FanServiceImpl  
 * @Description: 实现风扇相关操作的接口 
 * @author: YiYChao
 * @date 2019年10月23日 下午7:42:36
 */
@Service
public class FanServiceImpl implements FanService{

	@Autowired
	private TbFanMapper fanMapper;
	
	@Override
	public void insertFan(TbFan fan) {
		fan.setFanTime(new Date());
		fanMapper.insert(fan);
	}

}
