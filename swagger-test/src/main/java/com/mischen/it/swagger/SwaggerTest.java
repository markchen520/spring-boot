package com.mischen.it.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableSwagger2
public class SwaggerTest 
{
	 public static void main(String[] args) {
	        SpringApplication.run(SwaggerTest.class, args);
	    }
}
