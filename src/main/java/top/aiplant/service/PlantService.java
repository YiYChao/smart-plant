package top.aiplant.service;
/**
 * @ClassName: PlantService  
 * @Description: 定义植栽相关的接口 
 * @author: YiYChao
 * @date 2019年10月20日 上午10:28:02
 */
public interface PlantService {

	/**
	 * @Title: findByTooken  
	 * @Description: 根据token查找植栽记录 
	 * @param: token字符串
	 * @return: int 植栽的id主键
	 * @throws:
	 * @date: 2019年10月20日 上午10:29:42
	 */
	int findIdByToken(String token);
}
