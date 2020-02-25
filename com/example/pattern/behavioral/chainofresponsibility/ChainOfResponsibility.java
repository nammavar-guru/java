package com.example.pattern.behavioral.chainofresponsibility;

public class ChainOfResponsibility {

	public static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is the information - FILE");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is error information - ERROR");
		loggerChain.logMessage(AbstractLogger.DEBUG, "this is debug information - CONSOLE");
	}

}
