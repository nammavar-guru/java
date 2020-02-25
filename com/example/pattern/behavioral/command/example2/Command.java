package com.example.pattern.behavioral.command.example2;

public class Command implements Runnable {
	private Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver=receiver;
	}
	
	public void run() {
		receiver.execute();
	}
}
