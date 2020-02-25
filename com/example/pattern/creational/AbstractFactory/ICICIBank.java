package com.example.pattern.creational.AbstractFactory;

public class ICICIBank implements Bank{
	String bankName = null;
	public ICICIBank() {
		bankName = "ICICI Bank";
	}
	public String getBankName() {
		return bankName; 
	}
}
