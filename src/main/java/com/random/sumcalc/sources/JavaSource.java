package com.random.sumcalc.sources;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class JavaSource implements GetRandomNumber{

	private static Integer range = 50;
	
	@Override
	public Integer getRandom() {
		Integer result = 0;
		
		Random ran = new Random();
		result = new Integer(ran.nextInt(1) + range);
		return result;
	}
}
