package com.restapi.webclient.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.restapi.webclient.entity.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/webclient")
public class WebClientRestControllerDemo {

	String baseUrl = "http://localhost:8080/api/jdbc";

	@GetMapping("/all")
	public Mono<List<Employee>> getAll() {

		WebClient webClient = WebClient.create(baseUrl);

		Flux<Employee> flux = webClient.get().uri("/getall").retrieve().bodyToFlux(Employee.class);

		flux.doOnNext((emp) -> {
			System.out.println(emp);
		});

		Mono<List<Employee>> mono = flux.collectList();

		return mono;

	}
	
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody  Employee employee){
		
		

		
		WebClient client = WebClient.create(baseUrl);
		Mono<String>  mono = client.post()
								.uri("/add")
								.body(Mono.just(employee), Employee.class)
									.retrieve()
									 .bodyToMono(String.class);
									 
	
		
				String msg =		mono.block();
				
			
		return "Record added";
		
		
	}
	
	
	
	

}
