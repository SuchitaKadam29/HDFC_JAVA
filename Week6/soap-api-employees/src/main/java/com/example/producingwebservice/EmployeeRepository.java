package com.example.producingwebservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.spring.guides.gs_producing_web_service.Employee;
import jakarta.annotation.PostConstruct;

@Component
public class EmployeeRepository {

	private static final Map<Integer, Employee> employees = new HashMap<>();

	@PostConstruct
	public void initEmployeeData() {

		Employee emp1 = new Employee(101, "King", 65000);
		employees.put(emp1.getEid(), emp1);

		Employee emp2 = new Employee(102, "Tom", 45000);
		employees.put(emp2.getEid(), emp2);

		Employee emp3 = new Employee(103, "Smith", 50000);
		employees.put(emp3.getEid(), emp3);

		Employee emp4 = new Employee(104, "Ford", 30000);
		employees.put(emp4.getEid(), emp4);

	}

	public Employee findEmployeeById(int eid) {

		// select * from employee_table where eid = ?;
			//pstmt.setInt(1,eid);
		
		return employees.get(eid);

	}

}
