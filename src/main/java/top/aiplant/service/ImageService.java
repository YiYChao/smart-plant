package top.aiplant.service;

import java.util.List;

import top.aiplant.entity.TbImg;

/**
 * @ClassName: ImageService  
 * @Description: 定义图片相关参数接口 
 * @author: YiYChao
 * @date 2019年11月16日 下午7:02:02
 */
public interface ImageService {

	/**
	 * @Title: insert2Img
	 * @Description: 新增图片到数据库
	 * @param: imgBytes	字节图片内容
	 * @param: fileName	包含图片完整路径的名称
	 * @param: img	图片实体
	 * @return: void	空
	 * @throws Exception 
	 * @date: 2019年11月16日 下午7:09:19
	 */
	public void insert2Img(byte[] imgBytes, String fileName, TbImg img) throws Exception;
	
	/**
	 * @Title: findAllByPlantId
	 * @Description: 查找盆栽下的所有照片
	 * @param: plantId 盆栽Id
	 * @return: List<TbImg> 图片列表
	 * @throws: 无
	 * @date: 2019年12月5日 下午7:01:07
	 */
	public List<TbImg> findAllByPlantId(int plantId);
}
