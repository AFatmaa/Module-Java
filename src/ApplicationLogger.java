/**
 * Provides a simple application-level logging API.
 * It hides the file opening, writing and closing steps from other classes.
 */
public class ApplicationLogger {
    private FileLogger fileLogger;

    /**
     * Creates an application logger with its own FileLogger.
     */
    public ApplicationLogger() {
        this.fileLogger = new FileLogger();
    }

    /**
     * Logs an info message.
     *
     * @param message the message to log
     */
    public void logInfo(String message) {
        log("[INFO] " + message);
    }

    /**
     * Logs an error message.
     *
     * @param message the error message to log
     */
    public void logError(String message) {
        log("[ERROR} " + message);
    }

    /**
     * Handles the correct file logging order.
     *
     * @param message the formatted message to log
     */
    private void log(String message) {
        fileLogger.openFile();
        fileLogger.writeLine(message);
        fileLogger.closeFile();
    }
}
