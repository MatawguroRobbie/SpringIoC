package com.ibm.training.spring.ioc.demo05.messagerenderer;

import com.ibm.training.spring.ioc.demo05.messageprovider.MessageProvider;

public interface MessageRenderer {

	void render();

	void setMessageProvider(MessageProvider provider);

}
