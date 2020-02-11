package com.ibm.training.spring.ioc.demo06.messagerenderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.training.spring.ioc.demo06.messageprovider.MessageProvider;

@Component("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {

	@Autowired
	MessageProvider provider;

	public void render() {
		if (provider != null) {
			System.out.println(provider.getMessage());
		} else {
			System.out.println("<Error: No message provider found");
		}

	}

//	public void setMessageProvider(MessageProvider provider) {
//		this.provider = provider;
//	}

}
