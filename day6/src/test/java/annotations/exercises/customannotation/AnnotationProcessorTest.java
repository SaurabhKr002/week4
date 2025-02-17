package annotations.exercises.customannotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AnnotationProcessorTest {

    @Test
    void testAnnotationProcessing() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AnnotationProcessor.processAnnotations(TaskManager.class);

        String expectedOutput =
                "Method: completeTask" + System.lineSeparator() +
                        "Priority: High" + System.lineSeparator() +
                        "Assigned To: Saurabh" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
