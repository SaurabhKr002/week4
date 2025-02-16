package junit.basicjunittest.filehandling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";
    private FileProcessor fileProcessor;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @Test
    @DisplayName("Test Writing and Reading from File")
    void testWriteAndReadFromFile() throws IOException {
        String expectedContent = "Hello, this is a test!";

        // Write to file
        fileProcessor.writeToFile(TEST_FILE, expectedContent);

        // Read from file
        String actualContent = fileProcessor.readFromFile(TEST_FILE);

        // Assertions
        assertEquals(expectedContent, actualContent, "File content should match expected content");
    }

    @Test
    @DisplayName("Test File Exists After Writing")
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Checking file existence");
        assertTrue(fileProcessor.fileExists(TEST_FILE), "File should exist after writing");
    }

    @Test
    @DisplayName("Test IOException for Non-Existent File")
    void testIOExceptionForNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"),
                "Should throw IOException when reading a non-existent file");
    }

    @AfterEach
    void tearDown() throws IOException {
        // Clean up by deleting the test file
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }
}
