package com.example.java8.methodReference.staticReference;

interface Sayable {
	public void say();
}
public class StaticReferenceExample {

	public static void tetInterfaceMethod() {
		System.out.println("test interface method");
	}

	public static void main(String[] args) {
		Sayable sayb = StaticReferenceExample::tetInterfaceMethod;
		//sayb.say();
	}

}
