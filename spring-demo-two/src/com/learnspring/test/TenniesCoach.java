package com.learnspring.test;

public class TenniesCoach implements Coach {

	private RandomFortuneService mFs;
	
	public RandomFortuneService getmFs() {
		return mFs;
	}

	public void setmFs(RandomFortuneService mFs) {
		System.out.println("TenniesCoach setmFs");
		this.mFs = mFs;
	}

	@Override
	public String getTrainingMessage() {
		System.out.println("TenniesCoach getTrainingMessage");
		return "Play with tennies ball.";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("TenniesCoach getDailyFortune");
		return mFs.getFortuneMessage();
	}
	
	public void initMethod() {
		System.out.println("TenniesCoach initMethod");
	}
	
	public void destroyMethod() {
		System.out.println("TenniesCoach destroyMethod");
	}

}
