package com.ibm.training.spring.ioc.demo04.messageprovider;

public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		return "Hello World with Bean Factory!!!";
	}

}
