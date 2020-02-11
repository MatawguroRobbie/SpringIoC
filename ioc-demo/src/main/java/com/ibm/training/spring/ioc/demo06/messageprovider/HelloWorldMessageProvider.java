package com.ibm.training.spring.ioc.demo06.messageprovider;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		return "Hello World with Autowiring!!!";
	}

}
