package top.aiplant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.aiplant.dao.TbImgMapper;
import top.aiplant.entity.TbImg;
import top.aiplant.entity.TbImgExample;
import top.aiplant.entity.TbImgExample.Criteria;
import top.aiplant.service.ImageService;
import top.aiplant.tools.FastDFSClient;
/**
 * @ClassName: ImageServicemImpl  
 * @Description: 图片相关操作接口实现 
 * @author: YiYChao
 * @date 2019年11月16日 下午7:11:15
 */
@Service
public class ImageServicemImpl implements ImageService{

	@Autowired
	private TbImgMapper imgMapper;
	
	@Override
	public void insert2Img(byte[] imgBytes, String fileName, TbImg img) throws Exception {
		FastDFSClient FastDFSClient = new FastDFSClient(null);
		String path = FastDFSClient.uploadFile(fileName, imgBytes);	// 上传图片
		img.setImgUrl(img.getImgUrl() + path);	// IP + 服务器中的图片路径
		img.setImgStatus((byte)1); 	// 设置图片状态为正常
		imgMapper.insert(img);	// 将数据同步到数据库
	}

	@Override
	public List<TbImg> findAllByPlantId(int plantId) {
		TbImgExample example = new TbImgExample();
		Criteria criteria = example.createCriteria();
		criteria.andPlantIdEqualTo(plantId);
		List<TbImg> imgList = imgMapper.selectByExample(example);
		return imgList;
	}

}
