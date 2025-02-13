package userinput;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.*;

class UserInputHandlerTest {
    private static final String TEST_FILE = "test_user_data.txt";

    @Test
    void testFileWriting() {
        String[] testData = {"Alice", "25", "Java"};

        UserInputHandler.saveToFile(testData);
        Path filePath = Paths.get("D:\\Txt_Files_II\\Store_info.txt");

        assertTrue(Files.exists(filePath), "File should be created.");
        try {
            String content = Files.readString(filePath);
            assertTrue(content.contains("Alice"), "File should contain name.");
            assertTrue(content.contains("25"), "File should contain age.");
            assertTrue(content.contains("Java"), "File should contain language.");
        } catch (IOException e) {
            fail("Error reading test file.");
        }

        new File("user_data.txt").delete(); // Cleanup test file
    }
}
