package filterstreams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class TextConverterTest {

    @Test
    void testUppercaseToLowercaseConversion() throws IOException {
        String testInput = "test_input.txt";
        String testOutput = "test_output.txt";

        // Create a test input file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testInput))) {
            writer.write("HELLO WORLD\nTHIS IS A TEST.");
        }

        // Convert text and write to the output file
        TextConverter.convertUppercaseToLowercase(testInput, testOutput);

        // Read the output file
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(testOutput))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }
        }

        // Expected output
        String expectedOutput = "hello world\nthis is a test.\n";
        assertEquals(expectedOutput, result.toString(), "Conversion should match expected output.");
    }
}
