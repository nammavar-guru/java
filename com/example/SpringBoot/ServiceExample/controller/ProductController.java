package com.example.SpringBoot.ServiceExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.SpringBoot.ServiceExample.model.Product;
import com.example.SpringBoot.ServiceExample.service.ProductService;

@RestController
public class ProductController {

	
	@Autowired
	ProductService service;
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable String id){
		service.deleteProduct(id);
		
		return new ResponseEntity("Product is deleted successfully", HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product ){
		service.updateProduct(id, product);
		return new ResponseEntity("Product is updated successfully",HttpStatus.OK);
	}
	
	@PostMapping("/products")
	public ResponseEntity<Object> createProduct(@RequestBody Product product){
		service.createProduct(product);
		return new ResponseEntity("Product is created successfully",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<Object> getProduct(){
		return new ResponseEntity<>(service.getProducts(),HttpStatus.OK);
	}
}
