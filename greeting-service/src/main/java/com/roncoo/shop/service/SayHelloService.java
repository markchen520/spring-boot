package com.roncoo.shop.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.roncoo.shop.service.fallback.SayHelloServiceFallback;

@FeignClient(value = "SERVICE-SAY-HELLO", fallback = SayHelloServiceFallback.class)//这个是注册中心上的服务名称，需要在注册中心上面注册，然后调用才生效
public interface SayHelloService {
	   @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
	   public String sayHello(@RequestParam(value = "name") String name);

}
