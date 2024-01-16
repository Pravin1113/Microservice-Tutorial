package com.pravin.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.HttpHeadersReturnValueHandler;

import com.pravin.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	 private KafkaService kafkaService;
	
	@PostMapping
	public ResponseEntity  location() {
		kafkaService.updateLocation("("+ Math.random()+ ","+ Math.random()+")");
		return new ResponseEntity<>(Map.of("message","location Updateded"), HttpStatus.OK);
		
	}
	
	
	

}
