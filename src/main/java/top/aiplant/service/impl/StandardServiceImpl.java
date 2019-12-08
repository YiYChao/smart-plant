package top.aiplant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbStandardMapper;
import top.aiplant.entity.TbStandard;
import top.aiplant.entity.TbStandardExample;
import top.aiplant.entity.TbStandardExample.Criteria;
import top.aiplant.service.StandardService;

/**
 * @ClassName: StandardServiceImpl  
 * @Description: 植栽标准相关接口定义的实现 
 * @author: YiYChao
 * @date 2019年10月20日 下午5:03:39
 */
@Service
public class StandardServiceImpl implements StandardService{

	@Autowired
	private TbStandardMapper standardMapper;

	@Override
	public TbStandard findByPlantId(int plantId) {
		TbStandardExample example = new TbStandardExample();
		Criteria criteria = example.createCriteria();	// 创建条件对象
		criteria.andPlantIdEqualTo(plantId);	// 设置植栽id，外键
		List<TbStandard> stdList = standardMapper.selectByExample(example);		// 执行查询
		// 遍历过滤标准
		for (TbStandard tbStandard : stdList) {
			// 标准有效
			if(tbStandard.getStdStatus() == 1) {
				return tbStandard;
			}
		}
		return null;
	}

	@Override
	public void setExecution(int plantId, String name, float num) {
		TbStandardExample example = new TbStandardExample();
		Criteria criteria = example.createCriteria();
		criteria.andPlantIdEqualTo(plantId);
		TbStandard standard = standardMapper.selectByExample(example).get(0);
		if("LED灯".equals(name)) {
			standard.setAirLight(num);
		}else if("制冷风扇".equals(name)) {
			standard.setAirTemperature(num);
		}else if("灌溉水泵".equals(name)) {
			standard.setSoilHumidity(num);
		}else {
			return ;
		}
		standardMapper.updateByExample(standard, example);
	}

}
