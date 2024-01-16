package com.pravin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pravin.client.GreetApiClient;

@RestController
public class WelcomeRestController {

	@Autowired
	private GreetApiClient greetApiClient;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		String msg="microservice practice";
		String greetMsg=greetApiClient.invokegreetApi();
		
		
		
		return greetMsg+" "+msg;
	}
}
