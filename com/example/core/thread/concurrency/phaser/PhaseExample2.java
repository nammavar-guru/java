package com.example.core.thread.concurrency.phaser;

import java.util.concurrent.Phaser;

public class PhaseExample2 {

	public static void main(String[] args) {
		Phaser phaser = new Phaser(2 );
		Runnable run = ()->{
							phaser.register();
							System.out.println("REgistered");
							//phaser.arriveAndDeregister();
							System.out.println("Arrive and Await advance");
							
		};
		
		
		
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		t1.start();
		t2.start();
		phaser.awaitAdvance(2);
		System.out.println("Tasked");
	}

}
