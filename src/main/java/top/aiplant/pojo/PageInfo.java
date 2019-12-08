package top.aiplant.pojo;

import java.io.Serializable;
/**
 * @ClassName: PageInfo  
 * @Description: 定义一个结果分页 
 * @author: YiYChao
 * @date 2019年11月29日 下午12:21:44
 *  
 * @param <T>
 */
public class PageInfo<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer code;
	private String msg;
	private Integer count;
	private T data;
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public T getData() {
		return data;
	}
	
	public void setRstList(T data) {
		this.data = data;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public PageInfo(Integer code, String msg, Integer count, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}

	@Override
	public String toString() {
		return "PageInfo [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}
}
