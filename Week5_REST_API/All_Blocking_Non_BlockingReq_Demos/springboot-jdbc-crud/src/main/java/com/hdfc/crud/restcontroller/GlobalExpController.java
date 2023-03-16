package com.hdfc.crud.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hdfc.crud.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class GlobalExpController {
	
	
		@ExceptionHandler(EmployeeNotFoundException.class)
		public ResponseEntity<String> handleEmpNotFoundExp(){
			
			
			return new ResponseEntity<String>("Employee Not Found!",HttpStatus.BAD_REQUEST);
			
		}
	
	

}
