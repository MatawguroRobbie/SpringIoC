package com.ibm.training.spring.ioc.demo02;

public class MessageProvider {
	private final String message;

	public MessageProvider(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
