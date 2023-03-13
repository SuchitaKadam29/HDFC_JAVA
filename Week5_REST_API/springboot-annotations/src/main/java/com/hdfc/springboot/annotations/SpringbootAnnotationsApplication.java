package com.hdfc.springboot.annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hdfc.springboot.annotations.pojo.Employee;
import com.hdfc.springboot.annotations.service.EmployeeServiceImp;
import com.hdfc.springboot.annotations.service.IEmployeeService;

@SpringBootApplication
public class SpringbootAnnotationsApplication {

	public static void main(String[] args) {
	
		//IOC Container
	ConfigurableApplicationContext context =	SpringApplication.run(SpringbootAnnotationsApplication.class, args);
	
			Employee e1 =	context.getBean(Employee.class);
	
				System.out.println(e1);
				
				
		IEmployeeService service = context.getBean(EmployeeServiceImp.class);
					
				
			service.serviceMethod();
		
				
	}

}
