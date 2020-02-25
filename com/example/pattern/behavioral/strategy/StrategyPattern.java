package com.example.pattern.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class StrategyPattern {

	public static void main(String[] args) {
		ArrayList<File> files = new ArrayList<>();
		CompressionContext compContext = new CompressionContext();
		compContext.setStrategy(new RARCompressionStrategy());
		compContext.createArchive(files);
	}

}
