package annotations.exercises.repeatableannotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BugReportProcessorTest {

    @Test
    void testBugReportProcessing() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        BugReportProcessor.processBugReports(BugTracker.class);

        String expectedOutput =
                "Method: processBugs" + System.lineSeparator() +
                        "Bug Report: Null pointer exception occurs when input is null" + System.lineSeparator() +
                        "Bug Report: IndexOutOfBoundsException when accessing list" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
