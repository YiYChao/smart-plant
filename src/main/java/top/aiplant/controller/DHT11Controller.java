package top.aiplant.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.aiplant.entity.TbDht;
import top.aiplant.pojo.Echarts;
import top.aiplant.pojo.Series;
import top.aiplant.service.DHT11Service;

/**
 * @ClassName: DHT11Controller
 * @Description: 处理DHT11传感器相关的数据的增加与查询
 * @author: YiYChao
 * @date 2019年10月19日 下午5:33:05
 */
@Controller
public class DHT11Controller {

	@Autowired
	private DHT11Service dht11Service;

	@RequestMapping(path = "/dht")
	@ResponseBody
	public String insertDht(HttpServletRequest request, HttpServletResponse response) {
		TbDht dht = new TbDht();
		dht.setDhtTemperature(request.getParameter("tmpt")); // 设置温度
		dht.setDhtHumidity(request.getParameter("hmid")); // 设置湿度
		dht.setDhtHeat(request.getParameter("heat")); // 设置热度
//		dht.setSensorId(request.getParameter("sensor"));
		dht.setSensorId(1); // 设置传感器id
		System.out.println(dht.toString());
		dht11Service.insert2Dht(dht); // 调用服务层的方法进行记录增加
		return "SUCCESS";
	}

	@RequestMapping(path = "/find")
	@ResponseBody
	public Echarts findBySensorId() {
		List<TbDht> dhtList = dht11Service.findBySensorId(1);
		
		List<String> category = new ArrayList<String>();
		List<String> temperature = new ArrayList<String>();
		List<String> humidity = new ArrayList<String>();
		String getDate = null;
		
		for (TbDht dht : dhtList) {
			getDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dht.getDhtTime());
			category.add(getDate);
			temperature.add(dht.getDhtTemperature());
			humidity.add(dht.getDhtHumidity());
		}
		List<String> legend = new ArrayList<String>(Arrays.asList(new String[] { "温度 ","湿度" }));// 数据分组
		List<Series> series = new ArrayList<Series>();
		series.add(new Series("温度", "line", temperature));
		series.add(new Series("湿度", "line", humidity));
		
		Echarts data = new Echarts(legend, category, series);
		return data;
	}
}
