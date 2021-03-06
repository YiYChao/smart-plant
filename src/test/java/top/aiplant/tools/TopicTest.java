package top.aiplant.tools;

import java.io.IOException;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class TopicTest {
	
	@Autowired
	private TopicProducer topicProducer;
	@Test
	public void sendTextQueue(){
		topicProducer.sendTextMessage("SpringJMS-发布订阅7");
	}

	@Test
	public void testTopic(){
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	@Test
	public void topicProducer() throws JMSException {
		// 创建连接工厂
		ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://58.87.64.18:61616");
		// 获得连接对象
		Connection connection = factory.createConnection();
		// 启动连接
		connection.start();
		// 获得Session，参数1：是否开启事务，参数2：消息确认模式
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		// 创建主题
		Topic topic = session.createTopic("Topic-Test");
		// 创建发布者
		MessageProducer producer = session.createProducer(topic);
		TextMessage textMessage = session.createTextMessage("测试消息主题6");
		// 发送消息
		producer.send(textMessage);
		// 关闭资源
		producer.close();
		session.close();
		connection.close();
	}
	
	@Test
	public void topicConsumer() throws JMSException, IOException {
		// 创建连接工厂
		ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://58.87.64.18:61616");
		// 获得连接对象
		Connection connection = factory.createConnection();
		// 启动连接
		connection.start();
		// 获得Session，参数1：是否开启事务，参数2：消息确认模式
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		// 创建主题
		Topic topic = session.createTopic("Topic-Test");
		// 创建订阅者
		MessageConsumer consumer = session.createConsumer(topic);
		consumer.setMessageListener(new MessageListener() {
			@Override
			public void onMessage(Message message) {
				TextMessage textMessage = (TextMessage) message;
				try {
					System.out.println("订阅到：" + textMessage.getText());;
				} catch (JMSException e) {
					e.printStackTrace();
				}
			}
		});
		// 发送消息
		System.in.read();
		// 关闭资源
		consumer.close();
		session.close();
		connection.close();
	}
}
