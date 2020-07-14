package com.random.sumcalc.sources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.random.sumcalc.db.DBDao;

@Component
public class DBSource implements GetRandomNumber{

	@Autowired
	DBDao dbdao;
	
	@Override
	public Integer getRandom() {
		return dbdao.getRandom();
	}
}
