package annotations.practiceproblems.beginnerlevel.annotationtomarkimportantmethods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ImportantMethodProcessorTest {

    @Test
    void testImportantMethodProcessing() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ImportantMethodProcessor.processImportantMethods(TaskHandler.class);

        String expectedOutput =
                "Important Method: processCriticalTask | Level: CRITICAL" + System.lineSeparator() +
                        "Important Method: processGeneralTask | Level: HIGH" + System.lineSeparator();

        // Debugging - Print actual output
        System.out.println("Actual Output:\n" + outContent.toString());
        System.out.println("Expected Output:\n" + expectedOutput);

        assertTrue(outContent.toString().contains("processCriticalTask | Level: CRITICAL"));
        assertTrue(outContent.toString().contains("processGeneralTask | Level: HIGH"));

        // Reset System.out
        System.setOut(System.out);
    }
}
