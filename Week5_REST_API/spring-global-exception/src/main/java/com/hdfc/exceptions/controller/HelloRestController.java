package com.hdfc.exceptions.controller;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
		@GetMapping("/div/{n1}/{n2}")
		public String  getDiv(@PathVariable int n1 ,  @PathVariable int n2) {
			
			int result = n1/n2;
			
		int  statusCode =	HttpStatus.OK.value();
			
			
			return "Result is:  "+result +" Status code : "+statusCode;
			
		}
		
		@PostMapping("/add/{name}")
		public String  addName(@PathVariable  String name) {
			
			
			
			
			name = null;
			
			name.length(); //NPExp
			
			
			return "Welcome "+name+ " your name added";
			
			
		}
		
		
		/*
		 * @ExceptionHandler(ArithmeticException.class) // local exp handler public
		 * ResponseEntity<String> handleError(){
		 * 
		 * 
		 * return new
		 * ResponseEntity<String>("Can't Div Num By Zero",HttpStatus.BAD_REQUEST);
		 * 
		 * }
		 */
		
		/*
		 * //@Order(value = 1)
		 * 
		 * @ExceptionHandler(NullPointerException.class)
		 * 
		 * @ResponseStatus(code = HttpStatus.BAD_GATEWAY,reason =
		 * "Null Value Found Error") public void handleError2() {
		 * 
		 * 
		 * 
		 * }
		 */
		
		
		
		
		
		
	

}
