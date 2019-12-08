package top.aiplant.pojo;
/**
 * @ClassName: Series  
 * @Description: Echarts纵坐标数据包构造
 * @author: YiYChao
 * @date 2019年11月27日 上午10:01:29
 */

import java.util.List;

public class Series {

	public String name;
	public String type;
	public List<String> data;
	
	public Series(String name, String type, List<String> data) {
		super();
		this.name = name;
		this.type = type;
		this.data = data;
	}
	
	
}
