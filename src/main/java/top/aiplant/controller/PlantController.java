package top.aiplant.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import top.aiplant.entity.TbDht;
import top.aiplant.entity.TbLight;
import top.aiplant.entity.TbRain;
import top.aiplant.entity.TbSensor;
import top.aiplant.entity.TbSoil;
import top.aiplant.entity.TbWater;
import top.aiplant.service.DHT11Service;
import top.aiplant.service.LightService;
import top.aiplant.service.PlantService;
import top.aiplant.service.RainService;
import top.aiplant.service.SensorService;
import top.aiplant.service.SoilService;
import top.aiplant.service.WaterService;

/**
 * @ClassName: PlantController  
 * @Description: 植栽相关的前端控制器操作 
 * @author: YiYChao
 * @date 2019年10月20日 上午11:10:48
 */
@Controller
public class PlantController {

	@Autowired
	private PlantService plantService;
	@Autowired
	private SensorService sensorService;
	@Autowired
	private DHT11Service dht11Service;
	@Autowired
	private SoilService soilService;
	@Autowired
	private LightService lightService;
	@Autowired
	private RainService rainService;
	@Autowired
	private WaterService waterService;
	
	
	/**
	 * @Title: getPlantId  植栽的id，外键
	 * @Description: 根据植栽的id查询传感器表，找出其拥有的传感器 
	 * @param: request 请求
	 * @param: response 响应
	 * @return: List<TbSensor> 
	 * @throws: null
	 * @date: 2019年10月20日 下午3:15:46
	 */
	@RequestMapping(path="/res", method=RequestMethod.GET)
	@ResponseBody
	public String getPlantId(HttpServletRequest request, HttpServletResponse response) {
		String token = request.getParameter("token");
		int plantId = plantService.findIdByToken(token);
		List<TbSensor> sensorList = sensorService.findByPlantId(plantId);
		for (TbSensor tbSensor : sensorList) {
			if("DHT11温湿度传感器".equals(tbSensor.getSensorName())) {
				TbDht dht = new TbDht();
				dht.setDhtTemperature(request.getParameter("tmpt"));// 设置温度
				dht.setDhtHumidity(request.getParameter("humid"));	// 设置湿度
				dht.setDhtHeat(request.getParameter("heat"));		// 设置热度
				dht.setSensorId(tbSensor.getSensorId());			// 设置传感器Id
				dht11Service.insert2Dht(dht);						// 调用服务层的方法进行记录增加
			}else if("土壤湿度传感器".equals(tbSensor.getSensorName())) {
				TbSoil soil = new TbSoil();
				soil.setSoilHumidity(Integer.parseInt(request.getParameter("soil")));
				soil.setSensorId(tbSensor.getSensorId());
				soilService.insert2Soil(soil);
			}else if("光照强度传感器".equals(tbSensor.getSensorName())) {
				TbLight light = new TbLight();
				light.setLightIntensity(Integer.parseInt(request.getParameter("light")));
				light.setSensorId(tbSensor.getSensorId());
				lightService.insert2Light(light);
			}else if("雨水传感器".equals(tbSensor.getSensorName())) {
				TbRain rain = new TbRain();
				rain.setRainRainfall(Integer.parseInt(request.getParameter("rain")));
				rain.setSensorId(tbSensor.getSensorId());
				rainService.insert2Rain(rain);
			}else if("水位传感器".equals(tbSensor.getSensorName())) {
				TbWater water = new TbWater();
				water.setWaterDepth(Integer.parseInt(request.getParameter("water")));
				water.setSensorId(tbSensor.getSensorId());
				waterService.insert2Water(water);
			}else{
				System.err.println("暂无此传感器：" + tbSensor.getSensorName() + "\t" + tbSensor.getSensorId());
			}
		}
		return "SUCCESS";
	}
}
