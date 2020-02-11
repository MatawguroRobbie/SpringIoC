/**
 * 
 */
package com.ibm.training.spring.ioc.demo02;

/**
 * @author JoseRobertoTrinidad
 *
 */
public class HelloWorldApp02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MessageProvider source = new MessageProvider("Hello World, too!");
		MessageRenderer renderer = new MessageRenderer();
		renderer.write(source.getMessage());
	}

}
