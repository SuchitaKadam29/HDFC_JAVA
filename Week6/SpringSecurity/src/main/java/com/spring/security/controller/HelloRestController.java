package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloRestController {
	
	
	
		@GetMapping("/get")
		public String   getData() {
			
			
			return "Hello friends!";
			
		}
	
		
		@GetMapping("/getall")
		public String   getAllData() {
			
			
			return "All User Informations";
			
		}
		
		@PostMapping("/add")
		public  String  addData(@RequestBody Users user ) {
			
			
			
			return user.toString();
			
			
		}
		
	
		

}
