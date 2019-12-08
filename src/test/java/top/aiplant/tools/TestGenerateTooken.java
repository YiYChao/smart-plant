package top.aiplant.tools;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class TestGenerateTooken {

	@Resource
	private GenerateToken genToken;
	
	@Test
	public void testToken() {
		for(int i = 0; i < 10; i++) {
			String tk = genToken.getToken();
			System.out.println(i + ":\t" + tk);
		}
	}
}
