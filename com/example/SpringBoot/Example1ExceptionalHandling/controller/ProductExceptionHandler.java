package com.example.SpringBoot.Example1ExceptionalHandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.SpringBoot.Example1ExceptionalHandling.exception.CustomProductNotFoundException;
import com.example.SpringBoot.Example1ExceptionalHandling.exception.ProductNotFoundException;

@ControllerAdvice
public class ProductExceptionHandler {
	
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException exception){
		
		return new ResponseEntity("Product not found",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=CustomProductNotFoundException.class)
	@ResponseStatus(code=HttpStatus.BAD_REQUEST,reason="")
public void exceptionA(CustomProductNotFoundException exception){
		
	}
}
