package top.aiplant.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import top.aiplant.entity.TbImg;
import top.aiplant.service.ImageService;

/**
 * @ClassName: UploadController  
 * @Description: 图片 相关操作的前端控制器
 * @author: YiYChao 
 * @date 2019年11月3日 下午8:19:44
 */
@Controller
@RequestMapping("/image/")
public class ImageController {

	@Value("${FDFS_SERVER_URL}")
	private String FDFS_SERVER_URL;
	@Autowired
	private ImageService imageService;
	
	/**
	 * @Title: uploadImg
	 * @Description: 上传图片
	 * @param: img 图片
	 * @param: request 请求
	 * @param: response 响应
	 * @return: String 提示
	 * @throws: 无
	 * @date: 2019年12月5日 下午7:04:55
	 */
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	@ResponseBody
	public String uploadImg(@RequestParam("img") MultipartFile img, HttpServletRequest request,HttpServletResponse response) {
		// 判断文件是否为空
		if(!img.isEmpty()) {
			try {
				String originalFilename = img.getOriginalFilename(); 	// 获取文件的原始名称
				TbImg image = new TbImg();
				image.setImgUrl(FDFS_SERVER_URL);
				
				String timeStamp = request.getParameter("timeStamp");
				Date date = new SimpleDateFormat("yyyyMMddHHmmssSSS").parse(timeStamp);
				image.setImgDate(date);
				
				image.setPlantId(Integer.parseInt(request.getParameter("plantId")));
				
				imageService.insert2Img(img.getBytes(), originalFilename, image);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "SUCCESS";
	}
	
	/**
	 * @Title: findImage
	 * @Description: 通过盆栽Id获取盆栽的图片
	 * @param: request 请求
	 * @param: response 响应
	 * @return: List<TbImg> 图片列表
	 * @throws: 无
	 * @date: 2019年12月5日 下午7:09:34
	 */
	@RequestMapping("/find")
	@ResponseBody
	public List<TbImg> findImage(HttpServletRequest request, HttpServletResponse response) {
		if("".equals(request.getParameter("plantId")) || request.getParameter("plantId") == null) {
			return null;
		}else {
			int plantId = Integer.parseInt(request.getParameter("plantId"));
			return imageService.findAllByPlantId(plantId);
		}
	}
}
