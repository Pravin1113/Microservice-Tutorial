package com.pravin.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.pravin.constans.Constatnt;

@Configuration
public class ApacheConfig {
	
	@Bean
	public NewTopic  topic() {
		
		return TopicBuilder.name(Constatnt.TOPIC_NAME).build();
		
	}

}
