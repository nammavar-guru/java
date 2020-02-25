package com.example.core.thread.multithreading.executor;

import java.util.concurrent.Executor;

public class NewThreadExecutor implements Executor {
	
	public void execute(Runnable command) {
		Thread t = new Thread(command);
		t.start();
	}
}
