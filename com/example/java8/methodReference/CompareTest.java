package com.example.java8.methodReference;

public class CompareTest {
	public  int compareByFirstName(User first,User second) {
		return first.getFirstName().compareTo(second.getFirstName());
	}
	
	public  int compareByLastName(User first,User second) {
		return first.getLastName().compareTo(second.getLastName());
	}
}
