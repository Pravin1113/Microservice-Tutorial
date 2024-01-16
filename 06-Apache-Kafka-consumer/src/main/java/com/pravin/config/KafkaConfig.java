package com.pravin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.pravin.constans.Constatnt;

@Configuration
public class KafkaConfig {
	
	@KafkaListener(topics=Constatnt.TOPIC_NAME,groupId = "id-1")
	public void updatedLoc(String loc) {
		System.out.println(loc);
		
	}
	
	

}
