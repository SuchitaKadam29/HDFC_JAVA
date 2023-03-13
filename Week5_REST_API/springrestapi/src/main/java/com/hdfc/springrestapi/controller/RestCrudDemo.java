package com.hdfc.springrestapi.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/crud")
public class RestCrudDemo {
	
		@Autowired
		ArrayList<String>  list;
		
		
	
	
			@GetMapping("/getdata")
			public String   setData() {
				
			
				
				
				return  list.toString();
				
			}
			
			
			@PostMapping("/add/{item}")
			public String    addData(@PathVariable String item) {
				
				list.add(item);
				
				return "Item added";
				
				
			}
			
			@PutMapping("/update/{item}")
			public String    updateData(@PathVariable  String item) {
				
				list.add(1,item);
				
				return "Item updated";
				
				
			}
			
			
			@DeleteMapping("/delete/{id}")
			public String  deleteData(@PathVariable int id) {
				
				list.remove(id);
				
				return "Item Deleted";
				
				
			}
			
			
			
			
			
			
		
	
	

}
