package com.ibm.training.spring.ioc.demo04.messagerenderer;

import com.ibm.training.spring.ioc.demo04.messageprovider.MessageProvider;

public interface MessageRenderer {

	void render();

	void setMessageProvider(MessageProvider provider);

}
