package com.lombok.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokDemoApplication.class, args);
		
		 Employee emp = new Employee(101,"king",LocalDate.now());
		
		 System.out.println(emp);
		 
		 Student s1 = new Student();
		 	
		 		s1.setSid(101);
		 		
		 		
		 
		 System.out.println(s1.getSid());
		 
		 System.out.println(s1);
		 
		 Student s2 = new Student(11,9000);
		 
		 System.out.println(s2);
		
	}

}
