package exercise1_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    private static final Logger log = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {
        log.info("Application starting...");
        log.debug("This is a debug message that you should NOT see yet.");
        log.warn("Low disk space!");
        log.error("Something went wrong.", new RuntimeException("Test error"));

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                log.debug("Processing iteration {}", i);
            }
        }
    }
}