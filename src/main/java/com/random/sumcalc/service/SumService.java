package com.random.sumcalc.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.random.sumcalc.sources.GetRandomNumber;

@Service
public class SumService {

	private List<GetRandomNumber> getRandomNumber;
	
	@PostConstruct
	private void initialize(){
		getRandomNumber = new ArrayList<GetRandomNumber>();
	}
	
	public void addSource(GetRandomNumber getRandomNumberInterface) {
		getRandomNumber.add(getRandomNumberInterface);
	}

	public Integer calculate() {
		Integer result =  getRandomNumber.stream().mapToInt(i -> i.getRandom()).sum();
		getRandomNumber.clear();
		return result;
	}
}
