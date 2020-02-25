package com.example.SpringBoot.ServiceExample.service;

import java.util.Collection;

import com.example.SpringBoot.ServiceExample.model.Product;



public interface ProductService {
	public void createProduct(Product product);
	public void updateProduct(String id, Product product);
	public void deleteProduct(String id);
	public Collection<Product> getProducts();
	
}
