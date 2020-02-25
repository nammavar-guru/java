package com.example.SpringBoot.RestTemplate.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.SpringBoot.Example1.model.Product;

@RestController
public class ProductConsumerController {
	private static Map<String,Product> productRepository = new HashMap();
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/template/products")
	public String getProductList(){
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String url="http://localhost:8761/products";
		return restTemplate.exchange(url, HttpMethod.GET,entity,String.class).getBody();
	}
	
	@PostMapping("/template/products")
	public String createProducts(@RequestBody Product product){
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Product> entity = new HttpEntity<Product>(product,headers);
		String url="http://localhost:8761/products";
		return restTemplate.exchange(url, HttpMethod.POST,entity,String.class).getBody();
	}
	
	@PutMapping("/template/products/{id}")
	public String updateProducts(@PathVariable String id, @RequestBody Product product){
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Product> entity = new HttpEntity<Product>(product, headers);
		String url="http://localhost:8761/products/"+id;
		return restTemplate.exchange(url, HttpMethod.PUT,entity,String.class).getBody();
	}
	
	@DeleteMapping("/template/products/{id}")
	public String deleteProducts(@PathVariable String id){
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Product> entity = new HttpEntity<Product>(headers);
		String url="http://localhost:8761/products/"+id;
		return restTemplate.exchange(url, HttpMethod.DELETE,entity,String.class).getBody();
	}
	 
}
