package com.example.java8.methodReference.constructorReference;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		Messageable message = Message::new;
		message.getMessage("Method Reference Constructor Testing");
	}
}

interface Messageable {
	Message getMessage(String message);
}

class Message {
	Message(String message) {
		System.out.println(message);
	}
}