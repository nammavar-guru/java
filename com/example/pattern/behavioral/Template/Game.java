package com.example.pattern.behavioral.Template;

public abstract class Game {
	abstract void initialize();
	abstract void startGame();
	abstract void endGame();
	
	public final void play() {
		initialize();
		startGame();
		endGame();
	}
}
