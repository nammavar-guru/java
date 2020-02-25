package com.example.java8.methodReference;
interface Print{
	public void printA();
}

interface StringA {
	public String StringA();
}

public class MethodReferenceBasic {

	public void printMethod() {
		System.out.println("Test Print Method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceBasic mr = new MethodReferenceBasic();
		Print p = mr::printMethod;
		p.printA();
		
		Print pr = MethodReferenceBasic::new;
		pr.printA();
		
		
	}

}
