package com.pravin;



import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;


import reactor.core.publisher.Mono;

@Component
public class PreFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		ServerHttpRequest request=exchange.getRequest();
        HttpHeaders header=request.getHeaders();
        Set<String>keyset=header.keySet();
        keyset.forEach(key ->{
        	List<String> values=header.get(key);
        	System.out.println(key +" ::"+values);
        });
		
		return chain.filter(exchange);
	}

}
