/**
 * Runs the abstraction exercise for logging.
 */
public class LoggingDemo {
    public static void main(String[] args) {
        System.out.println("Using FileLogger directly:");

        FileLogger fileLogger = new FileLogger();
        fileLogger.openFile();
        fileLogger.writeLine("Application started");
        fileLogger.closeFile();

        System.out.println();
        System.out.println("Using ApplicationLogger:");

        ApplicationLogger applicationLogger = new ApplicationLogger();
        applicationLogger.logInfo("Application started");
        applicationLogger.logError("Something went wrong");
    }
}
