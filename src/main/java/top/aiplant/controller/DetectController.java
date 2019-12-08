package top.aiplant.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.aiplant.entity.TbPump;
import top.aiplant.entity.TbSoil;
import top.aiplant.pojo.DetectExecution;
import top.aiplant.pojo.PageInfo;
import top.aiplant.service.DetectPumpService;

/**
 * @ClassName: DetectController  
 * @Description: TODO 
 * @author: YiYChao
 * @date 2019年11月28日 下午11:16:30
 */
@Controller
public class DetectController {

	@Autowired
	private DetectPumpService detectPumpService;
	
	@RequestMapping(path="/detect/pump")
	@ResponseBody
	public PageInfo<List<DetectExecution<TbPump, TbSoil>>> detectPump(HttpServletRequest request){
		int page = Integer.parseInt(request.getParameter("page"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		return detectPumpService.detectByPage(1, page, limit);
	}
}
