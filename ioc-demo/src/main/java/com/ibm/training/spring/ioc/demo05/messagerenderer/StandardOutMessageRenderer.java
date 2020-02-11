package com.ibm.training.spring.ioc.demo05.messagerenderer;

import com.ibm.training.spring.ioc.demo05.messageprovider.MessageProvider;

public class StandardOutMessageRenderer implements MessageRenderer {

	MessageProvider provider;

	public void render() {
		if (provider != null) {
			System.out.println(provider.getMessage());
		} else {
			System.out.println("<Error: No message provider found");
		}

	}

	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}

}
