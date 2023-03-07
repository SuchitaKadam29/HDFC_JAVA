package com.hdfc.ems.testing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.hdfc.ems.dao.EmployeeDaoImp;
import com.hdfc.ems.dao.IEmployeeDAO;
import com.hdfc.ems.entity.Employee;

@Disabled
class EmployeeDaoImpTest {

	
	static IEmployeeDAO dao;
	
	@BeforeAll
	public static void  beforeAll() {
		
		dao = new EmployeeDaoImp();
		
	}
	
	
	@Test
	void testAddEmployee() {
		
		Employee emp = new Employee(111, "Akshat", 4500);
		
	int actual =	dao.addEmployee(emp);
	
		assertEquals(1, actual);
		
		
	}

	@Test
	void testGetAllEmployees() {
		
		
		
		List<Employee> list =	dao.getAllEmployees();
		
		System.out.println(list);
		
		assertNotNull(list);
		
		assertTrue(list.size() > 5);
		
		
		
	}

}