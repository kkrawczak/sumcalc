package com.random.sumcalc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.random.sumcalc.sources.DBSource;
import com.random.sumcalc.sources.GetRandomNumber;
import com.random.sumcalc.sources.JavaSource;
import com.random.sumcalc.sources.WSSource;

@Component
public class SourceType {

	@Autowired
	private ApplicationContext context;
	
	public GetRandomNumber someService(String type) {
	    switch (type) {
	    case "DB":
	        return context.getBean(DBSource.class);
	    case "JAVA":
	    	return context.getBean(JavaSource.class);
	    case "HTTP":
	        return context.getBean(WSSource.class);
	    default:
	        return new JavaSource();
	    }
	}
}