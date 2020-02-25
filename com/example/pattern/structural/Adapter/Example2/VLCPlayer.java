package com.example.pattern.structural.Adapter.Example2;

public class VLCPlayer implements MediaPlayer {
	public void play(String fileName) {
		run(fileName);
	}
	
	public void run(String fileName) {
		System.out.println("Playing VLCPlayer file -"+fileName);
	}
}
