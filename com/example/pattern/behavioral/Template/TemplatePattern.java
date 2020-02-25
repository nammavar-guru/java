package com.example.pattern.behavioral.Template;

import java.io.InputStream;

public class TemplatePattern {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
		
		InputStream input = null;

	}

}
