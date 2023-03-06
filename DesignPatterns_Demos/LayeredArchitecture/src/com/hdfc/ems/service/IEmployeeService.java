package com.hdfc.ems.service;

import java.util.List;

import com.hdfc.ems.entity.Employee;

public interface IEmployeeService {
	
	
		public  int   addEmployee(Employee emp);
		
		public List<Employee>  getAllEmployees();
	

}
