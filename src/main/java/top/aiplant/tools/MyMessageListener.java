package top.aiplant.tools;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

@Component
public class MyMessageListener implements MessageListener {
	public void onMessage(Message message) {
	TextMessage textMessage=(TextMessage)message;		
		try {
			System.out.println("Listener接收到消息："+textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
