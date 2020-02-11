package com.ibm.training.spring.ioc.demo07.messagerenderer;

import com.ibm.training.spring.ioc.demo07.messageprovider.MessageProvider;

public interface MessageRenderer {

	void render();

	void setMessageProvider(MessageProvider provider);

}
