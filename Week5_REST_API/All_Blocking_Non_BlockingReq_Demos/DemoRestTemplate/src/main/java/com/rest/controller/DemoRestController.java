package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rest.entity.Employee;

@RestController
@RequestMapping("/api/demo")
public class DemoRestController {

	
	@Autowired
	RestTemplate restTemplate;
	
	String baseUrl = "http://localhost:8080/api/jdbc";
	
	@GetMapping("/all")
	public   List<Employee>  getAll(){
		
		
		
						
		
		
List<Employee>  list =		restTemplate.getForObject(baseUrl+"/getall",List.class);
		
		
			System.out.println(list);
			
			return list;

		
	}
	
	
		@PostMapping("/addfromdemo")
		public  String  add(@RequestBody Employee employee) {
			
			
				
		String  msg =	  restTemplate.postForObject(baseUrl+"/add", employee, String.class);
			
		
		return msg;
		}
	
	
}
