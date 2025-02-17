package annotations.exercises.suppressuncheckedwarnings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class UncheckedWarningTest {

    @Test
    void testAddElements() {
        UncheckedWarning uncheckedWarning = new UncheckedWarning();

        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        uncheckedWarning.addElements();

        // Expected output
        String expectedOutput = "List contents: [Saurabh, 25, true]" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
