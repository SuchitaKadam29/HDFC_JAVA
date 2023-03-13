package com.hdfc.springboot.annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.springboot.annotations.service.IEmployeeService;

@RestController
@RequestMapping("/api/demo")
public class HelloController {

		@Autowired
		IEmployeeService service;
	
	
	@GetMapping("/get")
	public String   getMsg() {  // resource
		
		return "Hello Friends!";
		
	}
	
	@GetMapping("/get-service-obj")
	public String   getServiceObj() {
		
		return service.toString();
		
	}
	
	
	
}
