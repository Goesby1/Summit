package com.summitwt.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
// create configuration class here for spring continaer.
// when you create configuration class here, spring container will look into this class and get all beans configurations
// and their names,methods to invoke, create objects of the required java bean classes. 
@Configuration
public class HelloWorldConfig {
@Bean(name="helloWorldBean")  // define a bean with some unique name
@Description("this is a sample hellowoled bean class") // its optional 
// sprnig container will invoke this method and get all required bean objects
public HelloWorld helloWorld()
{
	return new HelloWorldImpl();
} 
// you can define many beans here with unique names..
//@Bean(name="Test")

}
