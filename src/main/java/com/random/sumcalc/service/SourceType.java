package com.random.sumcalc.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.random.sumcalc.sources.DBSource;
import com.random.sumcalc.sources.GetRandomNumber;
import com.random.sumcalc.sources.JavaSource;
import com.random.sumcalc.sources.WSSource;

@Configuration
public class SourceType {
		
	@Bean
	@Scope("request")
	public GetRandomNumber someService(String type) {
	    switch (type) {
	    case "DB":
	        return new DBSource();
	    case "JAVA":
	        return new JavaSource();
	    case "HTTP":
	        return new WSSource();
	    default:
	        return new JavaSource();
	    }
	}
}