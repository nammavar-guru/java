package com.example.pattern.behavioral.command.example2;

public class ThreadCommand {

	
	//ThreadCommand is Client
	//Runnable interface is Command
	//MyRunnable is ConcreteCommmand
	//Thread is Invoker with start() method calling ConcreteCommand implementaiton ( which calls run() method)
	
	public static void main(String[] args) {
		Receiver receiver = new AC();
		Thread t = new Thread(new Command(receiver));
		t.start();

	}

}
