package com.ibm.training.spring.ioc.demo07.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ibm.training.spring.ioc.demo07.messageprovider.HelloWorldMessageProvider;
import com.ibm.training.spring.ioc.demo07.messageprovider.MessageProvider;
import com.ibm.training.spring.ioc.demo07.messagerenderer.MessageRenderer;
import com.ibm.training.spring.ioc.demo07.messagerenderer.StandardOutMessageRenderer;

@Configuration
@ComponentScan("com.ibm.training.spring.ioc.demo07")
public class HelloWorldAppConfig {
	
	// equivalent to <bean id="provider" class=".."/>
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	// equivalent to <bean id="renderer" class=".."/>
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
