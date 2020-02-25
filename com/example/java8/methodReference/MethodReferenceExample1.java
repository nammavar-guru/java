package com.example.java8.methodReference;

interface Sayable{
	void say();
}
public class MethodReferenceExample1 {

	public static void sayStaticMessage() {
		System.out.println("Hello Static!");
	}
	
	
	public void sayMessage() {
		System.out.println("Hello !");
	}
	public static void main(String args[]) {
		Sayable say = MethodReferenceExample1::sayStaticMessage;
		say.say();
		
		MethodReferenceExample1 m1 = new MethodReferenceExample1();
		Sayable sayy = m1::sayMessage;
		sayy.say();
		
		Sayable sayyo = new MethodReferenceExample1()::sayMessage;
		sayyo.say();
		
	}
}
