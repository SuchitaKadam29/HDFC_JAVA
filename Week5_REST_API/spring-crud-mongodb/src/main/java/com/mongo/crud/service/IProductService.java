package com.mongo.crud.service;

import java.util.List;

import com.mongo.crud.entity.Product;

public interface IProductService {
	
	
			//crud 
	
				public   Product  addProduct(Product product);
				
				public  Product   updateProduct(Product product);
				
				public      List<Product>       getAllProducts();
				
				public  Product   getProductById(int id);
				
				public  void    deleteProductById(int id);
				
				public  List<Product>   getByPname(String pname);
				
				public  List<Product>   getByPrice(double price);
	
	
	

}
