package annotations.practiceproblems.intermediatelevel.annotationforloggingmethodexecutiontime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LogExecutionTimeProcessorTest {

    // Test class with a method using @LogExecutionTime
    static class SampleClass {
        @LogExecutionTime
        public void sampleMethod() {
            try {
                Thread.sleep(50); // Simulate processing delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Test
    void testLogExecutionTimeProcessing() throws Exception {
        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Process annotation
        SampleClass sample = new SampleClass();
        LogExecutionTimeProcessor.processAnnotations(sample);

        // Restore original output stream
        System.setOut(originalOut);

        // Check if execution time log is present
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Execution time of sampleMethod"),
                "Expected execution time log not found in output: " + output);
    }
}
