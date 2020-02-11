package com.ibm.training.spring.ioc.demo07.messageprovider;

public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		return "Hello World with @Configuration!!!";
	}

}
