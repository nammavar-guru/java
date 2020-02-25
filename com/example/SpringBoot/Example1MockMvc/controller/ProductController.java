package com.example.SpringBoot.Example1MockMvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.Example1.model.Product;

@RestController
public class ProductController {
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
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable String id){
		productRepository.remove(id);
		
		return new ResponseEntity("Product is deleted successfully", HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product ){
		productRepository.remove(id);
		product.setId(id);
		productRepository.put(product.getId(), product);
		
		return new ResponseEntity("Product is updated successfully",HttpStatus.OK);
	}
	
	@PostMapping("/products")
	public ResponseEntity<Object> createProduct(@RequestBody Product product){
		
		productRepository.put(product.getId(), product);
		return new ResponseEntity("Product is created successfully",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<Object> getProduct(){
		return new ResponseEntity<>(productRepository.values(),HttpStatus.OK);
	}
}
