package top.aiplant.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.aiplant.entity.TbFan;
import top.aiplant.entity.TbSensor;
import top.aiplant.service.FanService;
import top.aiplant.service.PlantService;
import top.aiplant.service.SensorService;

/**
 * @ClassName: FanController
 * @Description: 电机(风扇)相关的前端控制器
 * @author: YiYChao
 * @date 2019年10月23日 下午8:13:47
 */
@Controller
public class FanController {

	@Autowired
	private FanService fanService;
	@Autowired
	private PlantService plantService;
	@Autowired
	private SensorService sensorService;

	/**
	 * @Title: insertFan
	 * @Description: 新增风扇工作状态记录
	 * @param: request	HTTP请求
	 * @param: response HTTP响应
	 * @return: String 简单提示信息
	 * @throws: null
	 * @date: 2019年10月23日 下午9:43:57
	 */
	@RequestMapping(path = "/fan")
	@ResponseBody
	public String insertFan(HttpServletRequest request, HttpServletResponse response) {
		String status = request.getParameter("status"); // 获取电机(风扇)工作状态
		String token = request.getParameter("token"); // 获取盆栽的token
		if (status == null || "".equals(status) || status.length() > 1 || token == null || "".equals(token)) {
			return "PARAMS FAILURE"; // 参数列表不完整
		} else {
			int plantId = plantService.findIdByToken(token); // 通过盆栽token查询获取盆栽的id，主键
			List<TbSensor> sensorList = sensorService.findByPlantId(plantId); // 通过盆栽id查询获取盆栽的多有传感器
			// 遍历盆栽的传感器
			for (TbSensor tbSensor : sensorList) {
				// 找到风扇(电机)
				if ("制冷风扇".equals(tbSensor.getSensorName())) {
					TbFan fan = new TbFan(); // 创建风扇实体
					fan.setSensorId(tbSensor.getSensorId()); // 设置传感器的id值，外键
					fan.setFanStatus(Byte.valueOf(status)); // 将获取到的风扇工作状态设置到风扇实体中
					fanService.insertFan(fan); // 调用接口，实现风扇工作状态实体的新增
					return "SUCCESS"; // 记录新增成功
				}
			}
			return "SENSOR FAILURE"; // 传感器未定义
		}
	}
}
