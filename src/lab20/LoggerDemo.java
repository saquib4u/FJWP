package lab20;

// Client program to demonstrate the usage of the Logger class
public class LoggerDemo {
	public static void main(String[] args) {
		// Get the Logger instance
		Logger logger = Logger.getInstance();

		// Log messages from different parts of the application
		logger.log("Application started");
		doSomething(logger);
		logger.log("Application finished");
	}

	private static void doSomething(Logger logger) {
		logger.log("Doing something...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		logger.log("Done something!");
	}
}