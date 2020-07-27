package com.spring.kubeApp.springkubernetesapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello! Welcome to Employee-Consumer!";
	}
	
}
