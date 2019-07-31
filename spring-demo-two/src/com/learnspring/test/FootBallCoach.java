package com.learnspring.test;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class FootBallCoach implements Coach, MessageSourceAware {
	
	private RandomFortuneService mFortuneService;
	
	public RandomFortuneService getmFortuneService() {
		return mFortuneService;
	}

	public void setmFortuneService(RandomFortuneService mFortuneService) {
		this.mFortuneService = mFortuneService;
	}

	private MessageSource mMsgSource;

	@Override
	public String getTrainingMessage() {
		return mMsgSource.getMessage("football.msg", null, "Default Football", null);
	}

	@Override
	public String getDailyFortune() {
		return mFortuneService.getFortuneMessage();
	}

	@Override
	public void setMessageSource(MessageSource arg0) {
		mMsgSource = arg0;
		
	}

}
