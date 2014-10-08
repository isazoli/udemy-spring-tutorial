package isaszol.activemq.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

@EnableJms
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("isaszol/activemq/jms/beans.xml");
		
		JmsTemplate prodTemplate = (JmsTemplate) context.getBean("jmsProducerTemplate");
		prodTemplate.setDefaultDestination(new ActiveMQQueue("TEST.FOO"));
		prodTemplate.send(new MessageCreator() {
			
			public Message createMessage(Session arg0) throws JMSException {
				TextMessage m = new ActiveMQTextMessage();
				m.setJMSMessageID("MSG#1");
				m.setText("Hello ActiveMQ!");
				return m;
			}
		});
	}

}
