package com.ibm.training.spring.ioc.demo03;

import com.ibm.training.spring.ioc.demo03.messageprovider.HelloWorldMessageProvider;
import com.ibm.training.spring.ioc.demo03.messageprovider.MessageProvider;
import com.ibm.training.spring.ioc.demo03.messagerenderer.MessageRenderer;
import com.ibm.training.spring.ioc.demo03.messagerenderer.StandardOutMessageRenderer;

public class HelloWorldApp03 {

	public static void main(String[] args) {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		MessageProvider provider = new HelloWorldMessageProvider();
		renderer.setMessageProvider(provider);
		renderer.render();
	}

}
