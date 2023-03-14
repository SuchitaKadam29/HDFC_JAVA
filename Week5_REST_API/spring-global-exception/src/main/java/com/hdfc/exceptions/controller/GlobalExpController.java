package com.hdfc.exceptions.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExpController {
	
	
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String>  handleExp(){
		
		return  new ResponseEntity<String>("NEP Handle Globally",HttpStatus.EXPECTATION_FAILED);
		
	}
	
	
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleException(ArithmeticException ex) {
         
        
        int  errorValue = HttpStatus.INTERNAL_SERVER_ERROR.value();
        
        boolean  isServerError =		HttpStatus.INTERNAL_SERVER_ERROR.is5xxServerError();
        
        return new ResponseEntity<String>(ex.toString()+" "+errorValue +" "+isServerError, HttpStatus.INTERNAL_SERVER_ERROR);
    }

	

}
