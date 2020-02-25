package com.example.pattern.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
	private CompressionStrategy strategy;
	
	public void setStrategy(CompressionStrategy strategy) {
		this.strategy=strategy;
	}
	
	//use the strategy
	public void createArchive(ArrayList<File> files) {
		strategy.compressFiles(files);
	}
}
