package com.ibm.training.spring.ioc.demo05.messageprovider;

public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		return "Hello World with Spring!!!";
	}

}
