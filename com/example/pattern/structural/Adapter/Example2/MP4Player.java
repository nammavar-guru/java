package com.example.pattern.structural.Adapter.Example2;

public class MP4Player implements MediaPlayer {
	public void play(String fileName) {
		System.out.println("Playing MP4 Player - "+fileName);
	}
}
