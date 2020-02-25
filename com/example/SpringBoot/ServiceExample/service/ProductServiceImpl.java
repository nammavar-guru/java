package com.example.SpringBoot.ServiceExample.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.SpringBoot.ServiceExample.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
private static Map<String,Product> productRepository = new HashMap();
	
	static {
		Product honey = new Product();
		honey.setId("1");
		honey.setName("Honey");
		productRepository.put(honey.getId(), honey);
		
		Product almond = new Product();
		almond.setId("2");
		almond.setName("Almond");
		productRepository.put(almond.getId(), almond);
		
	}
	
	@Override
	public void createProduct(Product product) {
		productRepository.put(product.getId(), product);
	}
	
	@Override
	public void updateProduct(String id,Product product) {
		productRepository.remove(id);
		product.setId(id);
		productRepository.put(id,product);
	}
	
	@Override
	public void deleteProduct(String id) {
		productRepository.remove(id);
	}
	
	@Override
	public Collection<Product> getProducts(){
		return productRepository.values();
			
	}
}
