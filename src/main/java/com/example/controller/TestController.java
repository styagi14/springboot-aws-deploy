package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
	
	@GetMapping("/data")
	public String getTestData() {
		return "First message from AWS ECS !! ";
	}

}
