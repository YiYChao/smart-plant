package top.aiplant.tools;

import org.springframework.stereotype.Component;
/**
* @ClassName: GenerateTooken  
* @Description: 生成16位Tooken，只包含数字和大写英文字母
* @author: YiYChao
* @date 2019年10月19日 下午4:29:40
*
 */
@Component
public class GenerateToken {

	public String getToken() {
		// 开辟16位空间，用于存储产生的随机字符
		char[] res = new char[16];
		for (int i = 0; i < res.length; i++) {
			// Token包含的字符有： 0~9，A~Z，总共有10+26=36个数字
			double random = Math.random()*36;
			if(random < 10) {
				// 数字对应的ASCII码值为48~57
				res[i] = (char)(48 + Math.random()*10);
			}else {
				// 大写英文字母对应的ASCII码值为65~90
				res[i] = (char)(65 + Math.random()*26);
			}
		}
		return String.valueOf(res);
	}
}
