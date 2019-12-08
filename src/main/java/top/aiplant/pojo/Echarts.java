package top.aiplant.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Echarts  
 * @Description: Echarts数据表的数据构造 
 * @author: YiYChao
 * @date 2019年11月27日 上午9:58:06
 */
public class Echarts {

	public List<String> legend = new ArrayList<String>();	// 数据分组
	public List<String> category = new ArrayList<String>();	// 横坐标
	public List<Series> series = new ArrayList<Series>();	// 纵坐标
	// 构造方法
	public Echarts(List<String> legend, List<String> category, List<Series> series) {
		super();
		this.legend = legend;
		this.category = category;
		this.series = series;
	}
	
}
