package top.aiplant.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.aiplant.entity.TbPump;
import top.aiplant.entity.TbSensor;
import top.aiplant.service.PlantService;
import top.aiplant.service.PumpService;
import top.aiplant.service.SensorService;

/**
 * @ClassName: PumpController  
 * @Description: 水泵相关操作的前端控制器 
 * @author: YiYChao
 * @date 2019年10月23日 下午9:58:56
 */
@Controller
public class PumpController {

	@Autowired
	private PumpService pumpService;
	@Autowired
	private PlantService plantService;
	@Autowired
	private SensorService sensorService;

	/**
	 * @Title: insertPump
	 * @Description: 新增水泵工作状态记录
	 * @param: request HTTP请求
	 * @param: response HTTP响应
	 * @return: String 简单提示信息
	 * @throws: null
	 * @date: 2019年10月23日 下午22:00:13
	 */
	@RequestMapping(path = "/pump")
	@ResponseBody
	public String insertPump(HttpServletRequest request, HttpServletResponse response) {
		String status = request.getParameter("status"); // 获取水泵灯工作状态
		String token = request.getParameter("token"); // 获取盆栽的token
		if (status == null || "".equals(status) || status.length() > 1 || token == null || "".equals(token)) {
			return "PARAMS FAILURE"; // 参数列表不完整
		} else {
			int plantId = plantService.findIdByToken(token); // 通过盆栽token查询获取盆栽的id，主键
			List<TbSensor> sensorList = sensorService.findByPlantId(plantId); // 通过盆栽id查询获取盆栽的多有传感器
			// 遍历盆栽的传感器
			for (TbSensor tbSensor : sensorList) {
				// 找到水泵
				if ("灌溉水泵".equals(tbSensor.getSensorName())) {
					TbPump pump = new TbPump(); // 创建水泵实体
					pump.setSensorId(tbSensor.getSensorId()); // 设置传感器的id值，外键
					pump.setPumpStatus(Byte.valueOf(status)); // 将获取到的水泵工作状态设置到水泵实体中
					pumpService.insertPump(pump); // 调用接口，实现水泵工作状态记录的新增
					return "SUCCESS"; // 记录新增成功
				}
			}
			return "SENSOR FAILURE"; // 传感器未定义
		}
	}
}
