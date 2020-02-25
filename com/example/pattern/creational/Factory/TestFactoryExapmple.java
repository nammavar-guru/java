package com.example.pattern.creational.Factory;

import java.io.IOException;

public class TestFactoryExapmple {

	public static void main(String[] args) throws IOException {
		//LoggerFactory lf = new LoggerFactory();
		
		Logger logf = LoggerFactory.getLogger("FILE");
		Logger logc = LoggerFactory.getLogger("CONSOLE");
		
		logf.debug("File Debug");
		logf.error("File Error");
		
		logc.debug("Console Debug");
		logc.error("Console Error");
		
	//java.util.ResourceBundle.getBundle()
		
	}

}
