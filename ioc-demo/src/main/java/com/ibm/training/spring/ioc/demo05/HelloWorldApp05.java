package com.ibm.training.spring.ioc.demo05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.training.spring.ioc.demo05.messagerenderer.MessageRenderer;

public class HelloWorldApp05 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/ibm/training/spring/ioc/demo05/application-context.xml");
		MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
		renderer.render();
	}

}
