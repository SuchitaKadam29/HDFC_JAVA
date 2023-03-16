package com.webclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.webclient.entity.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class EmployeesRunner implements CommandLineRunner {

	private static final String baseUrl = "http://localhost:8080/api/jdbc";

	@Override
	public void run(String... args) throws Exception {
			
				//getAllEmployee();
				
				addEmp();
		
	}

	public void getAllEmployee() {

		WebClient client = WebClient.create(baseUrl);
		Flux<Employee> flux = client.get().uri("/getall").retrieve().bodyToFlux(Employee.class);
		flux.doOnNext(System.out::println).blockLast();

	}
	
	
	public  void  addEmp() {
		
		Employee employee = new Employee(115,"King",80000);
		
		WebClient client = WebClient.create(baseUrl);
		Mono<String>  mono = client.post()
								.uri("/add")
								.body(Mono.just(employee), Employee.class)
									.retrieve()
									 .bodyToMono(String.class);
									 
		System.out.println(mono.block());
		
		
	}
	
	
	
	

}
