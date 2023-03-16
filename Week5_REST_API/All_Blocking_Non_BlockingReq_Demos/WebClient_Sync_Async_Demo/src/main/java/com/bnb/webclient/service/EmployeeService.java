package com.bnb.webclient.service;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnb.webclient.entity.Employee;

import reactor.core.publisher.Flux;

@Service
public class EmployeeService {

	public List<Employee> getAllEmployees() { // traditional blocking request using thread concept

		Long start = System.currentTimeMillis();

		List<Employee> employeeList = new ArrayList<Employee>();

		for (int i = 1; i <= 20; i++) {

			employeeList.add(new Employee(i, "Employee" + i, i * 1000));
			System.out.println("Employee Record : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		Long end = System.currentTimeMillis();

		System.out.println("Blocking Request");
		System.out.println("Total time taken By API Request : " + (end - start) / 1000 + " secs");

		return employeeList;

	}

		
	// reactive programming for streaming 20 employee objects
	public Flux<Employee> getStreamAllEmployee() {
		
		

		Flux<Employee> employeeList = Flux.range(1, 20).
											delayElements(Duration.ofSeconds(1)).
											  doOnNext((i) -> {
												  		
													System.out.println("Employee Record By Stream : " + i);
												}).map((i) -> {
													
															
													
														return new Employee(i, "Employee" + i, i * 1000);
													});

		

		System.out.println("Non-Blocking Request");
		
		
	

		return employeeList;

	}

}
