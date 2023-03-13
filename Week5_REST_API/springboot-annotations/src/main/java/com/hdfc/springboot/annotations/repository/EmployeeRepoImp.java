package com.hdfc.springboot.annotations.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hdfc.springboot.annotations.pojo.Employee;

@Repository
public class EmployeeRepoImp implements IEmployeeRepo {

	@Autowired
	Employee emp;
	
	
	@Override
	public void repoMethod() {

		System.out.println("Repository method is called....");
		System.out.println("repo using "+emp);
	}

}
