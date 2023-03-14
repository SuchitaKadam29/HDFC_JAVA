package com.hdfc.exceptions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	String name = null;
	
	
	@GetMapping("/demo/get")
	public String  get() {
		
		
		name.length(); // NE EXP
		
		
		return "Hello friends";
		
	}
	

}
