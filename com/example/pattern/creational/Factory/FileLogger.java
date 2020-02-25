package com.example.pattern.creational.Factory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileLogger implements Logger {
	PrintStream out;
	
	public FileLogger() {}
	
	public FileLogger(String file) throws IOException {
		out = new PrintStream(new FileOutputStream(file),true);
	}
	
	public void error(String message) {
		out.println("File ERROR:"+message);	
	}
	
	public void debug(String message) {
		out.println("File DEBUG:"+message);
	}
}
