package com.ibm.training.spring.ioc.demo07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ibm.training.spring.ioc.demo07.config.HelloWorldAppConfig;
import com.ibm.training.spring.ioc.demo07.messagerenderer.MessageRenderer;

public class HelloWorldApp07 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldAppConfig.class);
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}
}
