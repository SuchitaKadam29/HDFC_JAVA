package com.hdfc.ems.dao;

import java.util.List;

import com.hdfc.ems.entity.Employee;

public interface IEmployeeDAO {
	
	
	public  int   addEmployee(Employee emp);
	
	public List<Employee>  getAllEmployees();

	
	
	

}
