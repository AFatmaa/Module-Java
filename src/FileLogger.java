/**
 * Handles low-level file logging steps.
 */
public class FileLogger {
    private boolean fileOpen = false;

    /**
     * Opens the log file if it is not already open.
     */
    public void openFile() {
        if (fileOpen) {
            throw new IllegalStateException("File already open");
        }

        System.out.println("Opening log file...");
        fileOpen = true;
    }

    /**
     * Writes a line to the log file if the file is open.
     *
     * @param line the line to write to the log
     */
    public void writeLine(String line) {
        if (!fileOpen) {
            throw new IllegalStateException("Cannot write - file not open");
        }

        System.out.println("LOG: " + line);
    }

    /**
     * Closes the log file if it is currently open.
     */
    public void closeFile() {
        if (!fileOpen) {
            throw new IllegalStateException("File already closed");
        }

        System.out.println("Closing log file...");
        fileOpen = false;
    }
}
