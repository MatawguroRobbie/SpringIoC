/**
 * 
 */
package com.ibm.training.spring.ioc.demo04;

import com.ibm.training.spring.ioc.demo04.messageprovider.MessageProvider;
import com.ibm.training.spring.ioc.demo04.messagerenderer.MessageRenderer;

/**
 * @author JoseRobertoTrinidad
 *
 */
public class HelloWorldApp04 {
	
	public static void main(String[] args) {
	MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
	MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
	mr.setMessageProvider(mp);
	mr.render();
	}
}
