package top.aiplant.pojo;

import java.io.Serializable;

/**
 * @ClassName: DetectExecution
 * @Description: 定义一个具有两个泛型参数类
 * @author: YiYChao
 * @date 2019年11月28日 下午10:25:33
 * 
 * @param <E> 执行器
 * @param <S> 传感器
 */
public class DetectExecution<E, S> implements Serializable{

	private static final long serialVersionUID = -4351946994527902026L;
	private E executor;
	private S sensor;

	public E getExecutor() {
		return executor;
	}

	public void setExecutor(E executor) {
		this.executor = executor;
	}

	public S getSensor() {
		return sensor;
	}

	public void setSensor(S sensor) {
		this.sensor = sensor;
	}

	public DetectExecution(E executor, S sensor) {
		super();
		this.executor = executor;
		this.sensor = sensor;
	}
	public DetectExecution() {
		super();
	}

	@Override
	public String toString() {
		return executor + "," + sensor;
	}
}
