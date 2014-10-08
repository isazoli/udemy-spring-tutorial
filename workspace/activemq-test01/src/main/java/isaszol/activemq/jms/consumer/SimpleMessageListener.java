package isaszol.activemq.jms.consumer;

import java.util.logging.Logger;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class SimpleMessageListener implements MessageListener {

	private static final Logger LOG = Logger.getLogger(SimpleMessageListener.class.getName());

	public void onMessage(Message message) {
		try {
			TextMessage msg = (TextMessage) message;
			LOG.info("Consumed message: " + msg.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}