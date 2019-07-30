package com.learnspring.test;

public class SwimCoach implements Coach {
	
	private FortuneService mFortuneService;
	
	public SwimCoach(FortuneService fs) {
		// TODO Auto-generated constructor stub
		mFortuneService = fs;
	}

	@Override
	public String getTrainingMessage() {
		return "Practise walking inside the water.";
	}
	
	public String getDailyFortune() {
		return mFortuneService.getFortuneMessage();
	}

}
