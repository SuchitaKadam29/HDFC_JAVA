package com.spring.hateoas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.hateoas.RepresentationModel;


public class User extends RepresentationModel {
	
	private String username;
	private double salary;
	
	
	
	
	public User() {
		super();
	}
	public User(String username, double salary) {
		super();
		this.username = username;
		this.salary = salary;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
