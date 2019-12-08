package top.aiplant.tools;

import org.apache.commons.io.FilenameUtils;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
/**
 * @ClassName: FastDFSClient  
 * @Description: FastDFS图片上传工具类 
 * @author: YiYChao
 * @date 2019年11月16日 下午1:50:15
 */
public class FastDFSClient {

	private TrackerClient trackerClient = null;
	private TrackerServer trackerServer = null;
	private StorageServer storageServer = null;
	private StorageClient1 storageClient = null;
	private String conf = "classpath:properties/fdfs_client.properties";
	public FastDFSClient(String conf) throws Exception {
		if(conf == null || "".equals(conf)) {
			conf = this.conf;
		}
		if (conf.contains("classpath:")) {
			conf = conf.replace("classpath:", this.getClass().getResource("/").getPath());
		}
		ClientGlobal.init(conf);
		trackerClient = new TrackerClient();
		trackerServer = trackerClient.getConnection();
		storageServer = null;
		storageClient = new StorageClient1(trackerServer, storageServer);
	}
	
	/**
	 * @Title: uploadFile
	 * @Description: 文件上传
	 * @param: fileName 文件全路径
	 * @param: extName 文件扩展名，不包含（.）
	 * @param:  metas 文件参数列表
	 * @return: String 返回文件路径
	 * @throws: Exception 异常
	 * @date: 2019年11月16日 下午6:39:07
	 */
	public String uploadFile(String fileName, String extName, NameValuePair[] metas) throws Exception {
		String result = storageClient.upload_file1(fileName, extName, metas);
		return result;
	}
	
	public String uploadFile(String fileName) throws Exception {
		return uploadFile(fileName, null, null);
	}
	
	public String uploadFile(String fileName, String extName) throws Exception {
		return uploadFile(fileName, extName, null);
	}
	
	/**
	 * @Title: uploadFile
	 * @Description: 调用文件上传的方法进行文件上传
	 * @param: fileContent	字节类型的文件内容
	 * @param: extName	文件扩展名
	 * @param: metas 文件参数列表
	 * @return: String	返回文件路径
	 * @throws: Exception 异常
	 * @date: 2019年11月16日 下午1:45:44
	 */
	public String uploadFile(byte[] fileContent, String extName, NameValuePair[] metas) throws Exception {
		return storageClient.upload_file1(fileContent, extName, metas);
	}
	
	// 重构上述方法
	public String uploadFile(byte[] fileContent) throws Exception {
		return uploadFile(fileContent, null, null);
	}
	
	public String uploadFile(byte[] fileContent, String extName) throws Exception {
		return uploadFile(fileContent, extName, null);
	}
	
	public String uploadFile(byte[] fileContent, String fileName, long size) throws Exception {
		// 获得文件的后缀名
		String ext = FilenameUtils.getExtension(fileName);
        System.out.println("fileName:" + fileName +"\t" + "ext:" + ext + "\t");
        NameValuePair[] meta_list = new NameValuePair[3];
        meta_list[0] = new NameValuePair("fileName",fileName);
        meta_list[1] = new NameValuePair("fileExt",ext);
        meta_list[2] = new NameValuePair("fileSize",String.valueOf(size));
		
		return uploadFile(fileContent, fileName, meta_list);
	}
	public String uploadFile(String fileName, byte[] fileContent) throws Exception {
		// 获得文件的后缀名
		String extName = FilenameUtils.getExtension(fileName);
		return uploadFile(fileContent, extName, null);
	}
}