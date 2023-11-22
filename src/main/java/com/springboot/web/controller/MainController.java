package com.springboot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/welcome")
	public String home() {
		System.out.println("This is Home Page!");
		return "home";
	}
	
}
