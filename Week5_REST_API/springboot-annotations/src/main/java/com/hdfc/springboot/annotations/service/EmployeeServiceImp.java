package com.hdfc.springboot.annotations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.springboot.annotations.repository.IEmployeeRepo;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeRepo repo;
	
	@Override
	public void serviceMethod() {

		System.out.println("service method is called....");
		
		System.out.println(repo);
		
		repo.repoMethod();
		
	}

}
