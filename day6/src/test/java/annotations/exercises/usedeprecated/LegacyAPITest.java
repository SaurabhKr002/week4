package annotations.exercises.usedeprecated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LegacyAPITest {

    @Test
    void testOldFeature() {
        LegacyAPI api = new LegacyAPI();

        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        api.oldFeature(); // Calling deprecated method

        // Normalize newlines for cross-platform compatibility
        String expectedOutput = "This is the old feature. Please use newFeature() instead." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testNewFeature() {
        LegacyAPI api = new LegacyAPI();

        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        api.newFeature(); // Calling new method

        // Normalize newlines for cross-platform compatibility
        String expectedOutput = "This is the new feature with improved functionality." + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
