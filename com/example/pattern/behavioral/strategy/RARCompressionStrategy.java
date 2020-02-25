package com.example.pattern.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;

public class RARCompressionStrategy implements CompressionStrategy {
	public void compressFiles(ArrayList<File> files) {
		System.out.println("RAR Compression Strategy Compress Files");
	}
}
