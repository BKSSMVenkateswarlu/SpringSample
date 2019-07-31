package com.learnspring.test;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private ArrayList<String> mFortuneArray;

	public ArrayList<String> getmFortuneArray() {
		return mFortuneArray;
	}

	public void setmFortuneArray(ArrayList<String> mFortuneArray) {
		this.mFortuneArray = mFortuneArray;
	}

	@Override
	public String getFortuneMessage() {
		Random random = new Random();
		int next;
		next = random.nextInt(3);

		return mFortuneArray.get(next);
	}

}
