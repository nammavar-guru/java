package com.example.SpringBoot.mockitoUnitTesting;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public String getProductName() {
		return "Honey";
	}
}
