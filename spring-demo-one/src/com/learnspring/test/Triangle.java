package com.learnspring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;

public class Triangle implements Shape {

	private ResourceBundleMessageSource messageSource;
	
	public ResourceBundleMessageSource getmessageSource() {
		return messageSource;
	}

	@Autowired
	public void setmessageSource(ResourceBundleMessageSource rms) {
		this.messageSource = rms;
	}

	@Override
	public void draw() {
		
		System.out.println(messageSource.getMessage("drawtriangle", null, "Default Message", null));
	}

}
