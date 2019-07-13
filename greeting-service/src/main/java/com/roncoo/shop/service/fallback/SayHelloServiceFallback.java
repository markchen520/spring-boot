package com.roncoo.shop.service.fallback;

import org.springframework.stereotype.Component;

import com.roncoo.shop.service.SayHelloService;

@Component
public class SayHelloServiceFallback implements SayHelloService {

	public String sayHello(String name) {
		return "error, " + name;
	}
	
	

}
