package com.spring.security.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Users {
	
	private int id;
	private String uname;
	private String email;

}
