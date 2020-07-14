package com.random.sumcalc.sources;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.random.sumcalc.model.RandomVO;
import com.random.sumcalc.model.RespnseRandomVO;

@Component
public class WSSource implements GetRandomNumber{
    private final String uri = "https://random.api.randomkey.io/v1/int";
    private final String token = "067be854ce7db957ffd607b49bef592a";
    
	@Override
	public Integer getRandom() {
		RandomVO newRandom = new RandomVO(new Integer(1), new Integer(50), new Integer(1));
		 
	    RestTemplate restTemplate = new RestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("auth", token);      
	    HttpEntity<RandomVO> request = new HttpEntity<>(newRandom, headers);

	    ResponseEntity<RespnseRandomVO> result = restTemplate.postForEntity( uri, request, RespnseRandomVO.class);
	 
	    return result.getBody().getNumber().get(0)[0];
	}
}
