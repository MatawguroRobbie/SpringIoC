package com.ibm.training.spring.ioc.demo03.messagerenderer;

import com.ibm.training.spring.ioc.demo03.messageprovider.MessageProvider;

public interface MessageRenderer {

	void render();

	void setMessageProvider(MessageProvider provider);

}
