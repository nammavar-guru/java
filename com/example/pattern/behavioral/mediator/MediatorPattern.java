package com.example.pattern.behavioral.mediator;

public class MediatorPattern {
	public static void main(String[] args) {
		User usr1 = new User("Kumaresh");
		User usr2 = new User("Nikhil");
		usr1.sendMessage("Hello");
		usr2.sendMessage("Hai");
	}
}
