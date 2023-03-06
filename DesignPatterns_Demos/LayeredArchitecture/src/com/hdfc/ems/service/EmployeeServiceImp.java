package com.hdfc.ems.service;

import java.util.List;

import com.hdfc.ems.dao.EmployeeDaoImp;
import com.hdfc.ems.dao.IEmployeeDAO;
import com.hdfc.ems.entity.Employee;

public class EmployeeServiceImp implements IEmployeeService {

		private  IEmployeeDAO dao;
		
		public EmployeeServiceImp() {
			
			dao = new EmployeeDaoImp();
			
			
		}
	
	
	@Override
	public int addEmployee(Employee emp) {
		
		
		return dao.addEmployee(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}
