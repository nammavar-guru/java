package com.example.pattern.creational.Factory;

import java.io.IOException;

public class LoggerFactory {
	public static Logger getLogger(String loggerType) throws IOException {
		if (loggerType.equals("FILE")) {
			Logger logger = new FileLogger("Logger.file");
			return logger;
		}
		if (loggerType.equals("CONSOLE")) {
			Logger logger = new ConsoleLogger();
			return logger;
		}
		return null;
	}
}
