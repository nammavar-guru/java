package com.example.java8.FunctionalInterface;

@FunctionalInterface
interface Sayable {
	void say(String message);
	static void say1() { System.out.println("Test SAY1");}
}

public class TestFunctionalInterface {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Sayable sayable = (msg)->System.out.println("Test Message -->"+msg);
		sayable.say("Functional Interface Example");
		Sayable.say1();
	}

}
