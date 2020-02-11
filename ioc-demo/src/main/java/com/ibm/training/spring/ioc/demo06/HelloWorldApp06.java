package com.ibm.training.spring.ioc.demo06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.training.spring.ioc.demo06.messagerenderer.MessageRenderer;

public class HelloWorldApp06 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/ibm/training/spring/ioc/demo06/application-context.xml");
		MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
		renderer.render();	}

}
