package com.mongo.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.crud.entity.Product;
import com.mongo.crud.repository.ProductRepository;

@Service
public class ProductServiceImp implements IProductService {

		@Autowired
		ProductRepository repo;
	
	
	@Override
	public Product addProduct(Product product) {
		
		
			return	repo.save(product);

	}


	@Override
	public Product updateProduct(Product product) {
		
		return repo.save(product);
	}


	@Override
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}


	@Override
	public Product getProductById(int id) {
		
		return   repo.findById(id).orElse(null);
	}


	@Override
	public void deleteProductById(int id) {
	
		
				repo.deleteById(id);
		
	}


	@Override
	public List<Product> getByPname(String pname) {
		// TODO Auto-generated method stub
		return repo.findByPname(pname);
	}


	@Override
	public List<Product> getByPrice(double price) {
		// TODO Auto-generated method stub
		return repo.findByPrice(price);
	}

}
