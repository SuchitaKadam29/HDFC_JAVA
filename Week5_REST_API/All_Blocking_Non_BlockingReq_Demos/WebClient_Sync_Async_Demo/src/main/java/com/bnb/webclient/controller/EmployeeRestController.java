package com.bnb.webclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnb.webclient.entity.Employee;
import com.bnb.webclient.service.EmployeeService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	@Autowired
	EmployeeService service;
	
	//traditional rest-api
	@GetMapping("/getall") // synchronous blocking request
	public List<Employee>  getAll(){
		
		return	service.getAllEmployees();
		
		
	}
	
	
	@GetMapping(value = "/stream" , produces = MediaType.TEXT_EVENT_STREAM_VALUE )
	public  Flux<Employee>   getAllReactive(){
		
		Long start = System.currentTimeMillis();
		
		Flux<Employee> streamData = service.getStreamAllEmployee();
		
		Long end = System.currentTimeMillis();
		
		System.out.println("Total Stream Api Time : "+(end-start));
		
		
		return streamData;
		
	}
 	
	
	
	
	

}
