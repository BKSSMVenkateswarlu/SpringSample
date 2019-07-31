package com.learnspring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext appCtx = 
		//		new ClassPathXmlApplicationContext("applicationContext.xml");
				new ClassPathXmlApplicationContext("applicationContextLifeCycle.xml");
		appCtx.registerShutdownHook();
		//Coach coach = (Coach) appCtx.getBean("swimcoach");//constructor injection
		//Coach coach = (Coach) appCtx.getBean("cricketcoach");//setter injection
		//CricketCoach coach = (CricketCoach) appCtx.getBean("cricketcoach");
		//System.out.println("Traning message: "+coach.getTrainingMessage());
		//System.out.println("Fortune message: "+coach.getDailyFortune());
		//System.out.println("Fortune message: "+coach.getTeam());
		
		/* Assignment -2 */
		/*
		 * Coach footBallCoach = (Coach) appCtx.getBean("footballCoach");
		 * System.out.println("FootBall Coach:"+ footBallCoach.getTrainingMessage());
		 * System.out.println("FootBall Coach Prediction:"+
		 * footBallCoach.getDailyFortune());
		 */
		
		/* Assignment - 3 using applicationContextLifeCycle.xml*/
		Coach tenniesCoach = (Coach)appCtx.getBean("tenniesCoach");
		System.out.println("TenniesCoach: "+tenniesCoach.getTrainingMessage());
		System.out.println("TenniesCoach Prediction: "+tenniesCoach.getDailyFortune());
		
		appCtx.close();
		
		
		
	}

}
