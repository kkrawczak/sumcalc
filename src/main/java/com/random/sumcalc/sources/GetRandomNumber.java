package com.random.sumcalc.sources;

import org.springframework.stereotype.Component;

@Component
public interface GetRandomNumber {

	default public Integer getRandom() {
		return 0;
	}
}
