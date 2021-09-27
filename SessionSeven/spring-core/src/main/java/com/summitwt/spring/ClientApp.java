package com.summitwt.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// activate the bean container
		// while activating the bean container, provide the details of config class or xml file.
		// it will activate container and read all configs in the config class and create bean factory
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		// get one bean from the bean factory using getBean() method of context
		HelloWorld object = (HelloWorld) context.getBean("helloWorldBean");
		// once you get bean class object, you can invoke any method of the bean class
		object.sayHello("Maruthi");

		
	}

}
