package exceptionhandling.trywithresources;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class FileReaderAutoCloseTest {

    @Test
    void testFileExists() throws IOException {
        // Create a temporary test file
        String testFile = "test_info.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFile))) {
            writer.write("Hello, World!");
        }

        assertEquals("Hello, World!", FileReaderAutoClose.readFirstLine(testFile));

        // Clean up test file
        new File(testFile).delete();
    }

    @Test
    void testFileNotExists() {
        assertEquals("Error reading file", FileReaderAutoClose.readFirstLine("nonexistent.txt"));
    }
}
