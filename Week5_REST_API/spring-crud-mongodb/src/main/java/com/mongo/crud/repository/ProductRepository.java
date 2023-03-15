package com.mongo.crud.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.crud.entity.Product;

@Repository  //optional
public interface ProductRepository extends MongoRepository<Product, Integer>{
	
	
		public  List<Product>   findByPname(String pname);
		
		public  List<Product>   findByPrice(double price);

}
