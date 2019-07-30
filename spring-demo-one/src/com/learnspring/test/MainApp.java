package com.learnspring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Shape shape = (Shape) appContext.getBean("triangle");
		shape.draw();
		
	}

}
