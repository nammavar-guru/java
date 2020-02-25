package com.example.core.oops.poly.overloading;

public class MethodOverloading {

	public static void main(String[] args) {
		foo(null);
	}

	public static void foo(Object o) {
		System.out.println("Object impl");
	}

	public static void foo(String s) {
		System.out.println("String impl");
	}

	//The method foo(Object) is ambiguous for the type of overloading	
//	  public static void foo(StringBuffer i){
//	  System.out.println("StringBuffer impl"); 
//	  }
	 
}
