package top.aiplant.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.aiplant.entity.TbStandard;
import top.aiplant.service.PlantService;
import top.aiplant.service.StandardService;

/**
 * @ClassName: StandardController
 * @Description: 植栽标准相关的操作
 * @author: YiYChao
 * @date 2019年10月20日 下午5:15:16
 */
@Controller
public class StandardController {

	@Autowired
	private PlantService plantService;
	@Autowired
	private StandardService standardService;

	/**
	 * @Title: getStandard
	 * @Description: 根据植栽的token获得该植栽的标准
	 * @param: request 请求
	 * @param: response 响应
	 * @return: TbStandard 标准实体
	 * @throws: null
	 * @date: 2019年10月20日 下午5:20:10
	 */
	@RequestMapping("/std")
	@ResponseBody
	public TbStandard getStandard(HttpServletRequest request, HttpServletResponse response) {
		String token = request.getParameter("token"); // 从请求中获取植栽的token
		int plantId = plantService.findIdByToken(token); // 通过盆栽token查询植栽的id，主键
		TbStandard standard = standardService.findByPlantId(plantId); // 通过植栽id查询植栽的标准
		return standard;
	}

	@RequestMapping("/std/led/open")
	@ResponseBody
	public String openLED() {
		System.out.println("LED灯打开成功");
		standardService.setExecution(1, "LED灯", 0);
		return "设置成功";
	}

	@RequestMapping(value = "/std/led/auto", produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
	@ResponseBody
	public String autoLED() {
		System.out.println("LED自动成功");
		standardService.setExecution(1, "LED灯", 100);
		return "设置成功";
	}

	@RequestMapping("/std/led/close")
	@ResponseBody
	public String closeLED() {
		System.out.println("LED灯关闭成功");
		standardService.setExecution(1, "LED灯", 260);
		return "设置成功";
	}

	@RequestMapping("/std/pump/open")
	@ResponseBody
	public String openPump() {
		System.out.println("水泵打开成功");
		standardService.setExecution(1, "灌溉水泵", 0);
		return "设置成功";
	}

	@RequestMapping("/std/pump/auto")
	@ResponseBody
	public String autoPump() {
		System.out.println("水泵自动成功");
		standardService.setExecution(1, "灌溉水泵", 230);
		return "设置成功";
	}

	@RequestMapping("/std/pump/close")
	@ResponseBody
	public String closePump() {
		System.out.println("水泵关闭成功");
		standardService.setExecution(1, "灌溉水泵", 260);
		return "设置成功";
	}

	@RequestMapping("/std/fan/open")
	@ResponseBody
	public String openFan() {
		System.out.println("风扇打开成功");
		standardService.setExecution(1, "制冷风扇", 0);
		return "设置成功";
	}

	@RequestMapping("/std/fan/auto")
	@ResponseBody
	public String autoFan() {
		System.out.println("风扇自动成功");
		standardService.setExecution(1, "制冷风扇", 27);
		return "设置成功";
	}

	@RequestMapping("/std/fan/close")
	@ResponseBody
	public String closeFan() {
		System.out.println("风扇关闭成功");
		standardService.setExecution(1, "制冷风扇", 100);
		return "设置成功";
	}
}
