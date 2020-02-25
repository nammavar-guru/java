package com.example.java8.methodReference.instanceReference;

interface Sayable {
	public void say();
}

public class instanceReferenceExample {

	public void tetInterfaceMethod() {
		System.out.println("test interface method");
	}

	public static void main(String[] args) {

		instanceReferenceExample ir = new instanceReferenceExample();
		Sayable sayable = ir::tetInterfaceMethod;
		sayable.say();

		Sayable sayb = new instanceReferenceExample()::tetInterfaceMethod;
		sayb.say();
	}

}
