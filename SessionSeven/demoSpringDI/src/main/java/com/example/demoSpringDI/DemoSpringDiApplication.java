package com.example.demoSpringDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSpringDiApplication.class, args);
		
		Cake cake=context.getBean(Cake.class);
		// Cake cake=new Cake();
		System.out.println(cake);
		
		Cake cake2= context.getBean(Cake.class);
		System.out.println(cake2);
		
		
		Flavor f = context.getBean(Flavor.class);
		System.out.println(f);
	}

}
