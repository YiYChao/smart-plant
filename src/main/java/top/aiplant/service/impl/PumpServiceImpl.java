package top.aiplant.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbPumpMapper;
import top.aiplant.entity.TbPump;
import top.aiplant.service.PumpService;
/**
 * @ClassName: insertPumpImpl  
 * @Description: 水泵相关的操作接口的实现 
 * @author: YiYChao
 * @date 2019年10月23日 下午7:47:57
 */
@Service
public class PumpServiceImpl implements PumpService{

	@Autowired
	private TbPumpMapper pumpMapper;
	
	@Override
	public void insertPump(TbPump pump) {
		pump.setPumpTime(new Date());
		pumpMapper.insert(pump);
	}

}
