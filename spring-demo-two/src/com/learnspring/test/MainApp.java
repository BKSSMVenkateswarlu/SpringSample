package com.learnspring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext appCtx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//Coach coach = (Coach) appCtx.getBean("swimcoach");//constructor injection
		//Coach coach = (Coach) appCtx.getBean("cricketcoach");//setter injection
		CricketCoach coach = (CricketCoach) appCtx.getBean("cricketcoach");
		System.out.println("Traning message: "+coach.getTrainingMessage());
		System.out.println("Fortune message: "+coach.getDailyFortune());
		System.out.println("Fortune message: "+coach.getTeam());
		
	}

}
