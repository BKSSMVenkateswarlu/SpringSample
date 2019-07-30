package com.learnspring.test;

public class CricketCoach implements Coach {

	private FortuneService mFs;
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public FortuneService getmFs() {
		return mFs;
	}

	public void setmFs(FortuneService mFs) {
		this.mFs = mFs;
	}

	@Override
	public String getTrainingMessage() {
		// TODO Auto-generated method stub
		return "Practise to hint any kind of ball with bat.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return mFs.getFortuneMessage();
	}

}
