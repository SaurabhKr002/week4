package filehandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class FileHandlerTest {
    @Test
    void testFileCopy() {
        String source = "test_source.txt";
        String destination = "test_destination.txt";

        try (FileWriter writer = new FileWriter(source)) {
            writer.write("Hello, this is a test file.");
        } catch (IOException e) {
            fail("Failed to create source test file.");
        }

        FileHandler.copyFile(source, destination);

        File destFile = new File(destination);
        assertTrue(destFile.exists(), "Destination file should be created.");

        try (BufferedReader reader = new BufferedReader(new FileReader(destination))) {
            String content = reader.readLine();
            assertEquals("Hello, this is a test file.", content, "File content mismatch.");
        } catch (IOException e) {
            fail("Failed to read destination file.");
        }

        // Cleanup
        new File(source).delete();
        new File(destination).delete();
    }
}
