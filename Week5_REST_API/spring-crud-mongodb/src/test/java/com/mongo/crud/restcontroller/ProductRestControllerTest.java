package com.mongo.crud.restcontroller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.mongo.crud.entity.Product;

@SpringBootTest
class ProductRestControllerTest {
	
	@Autowired
	RestTemplate restTemplate;
	

	@Test
	void testInsertProduct() {
		
		
		Product product = new Product(105, "Charger", 400);
		
Product product1 =	restTemplate.postForObject("http://localhost:8585/api/products/add",product,Product.class);
		
		
			assertNotNull(product1);
		
	}

	@Test
	void testGetProductById() {
		
		
				int id = 101;
		
ResponseEntity<Product>  response =	restTemplate.getForEntity("http://localhost:8585/api/products/get/"+id, Product.class);
		
				Product  product = response.getBody();
				
				assertEquals(product.getPrice(), 30000);
		
		
	}
	
	
	@Test
	void   testGetAllProducts() {
		
		
		
		
		
	}
	
	
	
	
	@Test
	void testUpdateProduct() {
		
		
		
	}
	
	@Test
	void  testDeleteProductById() {
		
		
		
	}
	
	
}
