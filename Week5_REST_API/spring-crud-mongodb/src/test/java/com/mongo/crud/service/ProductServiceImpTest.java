package com.mongo.crud.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mongo.crud.entity.Product;

@SpringBootTest
class ProductServiceImpTest {

	@Autowired
	IProductService service;
	
	@Test
	void testAddProduct() {
		
		Product product = new Product(121, "Car", 500000);
		
			Product pro =	service.addProduct(product);
		
		
				assertEquals(pro.getPname(), "Car");
				
				assertNotNull(pro);
			
	}

	@Test
	void testGetAllProducts() {
		
		List<Product>	list = service.getAllProducts();
		
			assertTrue(list.size() > 0);
			
			assertNotNull(list);
			
			assertEquals(list.get(0).getId(), 101);
		
	
	}

	@Test
	void testGetProductById() {
		
		
		Product product =		service.getProductById(102);
		
			assertNotEquals(product.getPrice(), 2000);
			
		
	}

}
