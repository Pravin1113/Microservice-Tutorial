package com.pravin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.pravin.constans.Constatnt;

@Service
public class KafkaService {
	
	@Autowired
	 private KafkaTemplate<String, String> kafkatemplate;
	
	public boolean updateLocation(String loc) {
		kafkatemplate.send(Constatnt.TOPIC_NAME,loc);
		return true;
		
	}

}
