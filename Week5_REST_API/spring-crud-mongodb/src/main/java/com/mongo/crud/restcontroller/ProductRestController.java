package com.mongo.crud.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.crud.entity.Product;
import com.mongo.crud.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	
		@Autowired
		IProductService service;
	
	
	@PostMapping("/add")
	public   Product  insertProduct(@RequestBody Product product) {
		
			return	service.addProduct(product);
		
		
	}
	
	@PutMapping("/update")
	public  Product   updateProduct(@RequestBody Product product) {
		
		
		  return service.updateProduct(product);
		
		
	}
	
	
	@GetMapping("/getall")
	public      List<Product>       getAllProducts(){
		
		
		return  service.getAllProducts();
		
		
	}
	
	
	
	@GetMapping("/get/{id}")
	public  Product   getProductById (@PathVariable int id) {
		
		
		return service.getProductById(id);
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	public  ResponseEntity<String>    deleteProductById(@PathVariable  int id) {
		
		
			service.deleteProductById(id);
			
			return  new ResponseEntity<String>("Record Deleted ",HttpStatus.OK);
		
		
	}
	
	

}
