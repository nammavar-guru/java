package com.example.pattern.creational.AbstractFactory;

public class HDFCBank implements Bank{
	String bankName = null;
	public HDFCBank() {
		bankName = "HDFC Bank";
	}
	public String getBankName() {
		return bankName; 
	}
}
