package lab20;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Singleton Logger class
class Logger {
	private static Logger instance;
	private PrintWriter writer;

	// Private constructor to prevent instantiation
	private Logger() {
		try {
			writer = new PrintWriter(new FileWriter("log.txt", true));
		} catch (IOException e) {
			System.err.println("Error creating log file: " + e.getMessage());
		}
	}

	// Static method to get the single instance of the Logger
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	// Method to log a message
	public void log(String message) {
		writer.println(message);
		writer.flush();
	}
}
