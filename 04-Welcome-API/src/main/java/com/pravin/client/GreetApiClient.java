package com.pravin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-APP")
public interface GreetApiClient {
	
	@GetMapping("/greet")
	public String invokegreetApi();

}
