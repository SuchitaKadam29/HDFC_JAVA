package com.hdfc.springrestapi;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestapiApplication.class, args);
	}
	
	
	
	@Bean
	public ArrayList<String>   getArrayListObj() {
		
		return new ArrayList<String>();
		
	}

}
