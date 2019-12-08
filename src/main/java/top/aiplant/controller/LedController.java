package top.aiplant.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.aiplant.entity.TbLed;
import top.aiplant.entity.TbSensor;
import top.aiplant.service.LedService;
import top.aiplant.service.PlantService;
import top.aiplant.service.SensorService;

/**
 * @ClassName: LedController
 * @Description: LED灯相关操作的前端控制器
 * @author: YiYChao
 * @date 2019年10月23日 下午9:52:06
 */
@Controller
public class LedController {

	@Autowired
	private LedService ledService;
	@Autowired
	private PlantService plantService;
	@Autowired
	private SensorService sensorService;

	/**
	 * @Title: insertLED
	 * @Description: 新增LED工作状态记录
	 * @param: request HTTP请求
	 * @param: response HTTP响应
	 * @return: String 简单提示信息
	 * @throws: null
	 * @date: 2019年10月23日 下午9:54:57
	 */
	@RequestMapping(path="/led")
	@ResponseBody
	public String insertLED(HttpServletRequest request, HttpServletResponse response) {
		String status = request.getParameter("status"); // 获取LED灯工作状态
		String token = request.getParameter("token"); // 获取盆栽的token
		System.out.println("收到LED请求");
		if (status == null || "".equals(status) || status.length() > 1 || token == null || "".equals(token)) {
			return "PARAMS FAILURE"; // 参数列表不完整
		} else {
			int plantId = plantService.findIdByToken(token); // 通过盆栽token查询获取盆栽的id，主键
			List<TbSensor> sensorList = sensorService.findByPlantId(plantId); // 通过盆栽id查询获取盆栽的多有传感器
			// 遍历盆栽的传感器
			for (TbSensor tbSensor : sensorList) {
				// 找到LED灯
				if ("LED灯".equals(tbSensor.getSensorName())) {
					TbLed led = new TbLed(); // 创建LED灯实体
					led.setSensorId(tbSensor.getSensorId()); // 设置传感器的id值，外键
					led.setLedStatus(Byte.valueOf(status)); // 将获取到的LED灯工作状态设置到LED灯实体中
					ledService.insertLED(led); // 调用接口，实现LED灯工作状态记录的新增
					return "SUCCESS"; // 记录新增成功
				}
			}
			return "SENSOR FAILURE"; // 传感器未定义
		}
	}
}
