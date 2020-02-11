package com.ibm.training.spring.ioc.demo04;

import java.util.Properties;

import com.ibm.training.spring.ioc.demo04.messageprovider.MessageProvider;
import com.ibm.training.spring.ioc.demo04.messagerenderer.MessageRenderer;

public class MessageSupportFactory {
	private static MessageSupportFactory instance;
	private Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;

	private MessageSupportFactory() {
		props = new Properties();
		try {
			props.load(this.getClass().getResourceAsStream("/com/ibm/training/spring/ioc/demo04/app.properties"));
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			renderer = (MessageRenderer) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
			provider = (MessageProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static {
		instance = new MessageSupportFactory();
	}

	public static MessageSupportFactory getInstance() {
		return instance;
	}

	public MessageRenderer getMessageRenderer() {
		return renderer;
	}

	public MessageProvider getMessageProvider() {
		return provider;
	}
}
