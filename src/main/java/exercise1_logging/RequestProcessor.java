package exercise1_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;

public class RequestProcessor {

    private static final Logger log = LoggerFactory.getLogger(RequestProcessor.class);

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            simulateRequest(i);
        }
    }

    private static void simulateRequest(int n) {
        String requestId = UUID.randomUUID().toString();

        MDC.put("requestId", requestId);

        log.info("Processing request {}", n);

        try {
            doSomeWork(n);
            if (n == 2) {
                throw new IllegalArgumentException("Bad input!");
            }

        } catch (Exception e) {
            log.error("Error while processing", e);

        } finally {
            MDC.clear();
        }
    }

    private static void doSomeWork(int n) {
        int result = n * 10;
        log.debug("Calculated result: {}", result);
    }
}
