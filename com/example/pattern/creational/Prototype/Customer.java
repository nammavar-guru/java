package com.example.pattern.creational.Prototype;

public class Customer implements Cloneable {
	String name ="guru";
	String number="2112";
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public Object deepClone() throws CloneNotSupportedException{
		Customer cust = (Customer)super.clone();
		return cust;
	}
	 public boolean equals(Object o)
	 {
		 Customer ce = (Customer)o;
		 return ce.name == name;
	 }

}
