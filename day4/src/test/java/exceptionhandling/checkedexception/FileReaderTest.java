package exceptionhandling.checkedexception;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void testReadFile_ExistingFile() throws IOException {
        // Create a test file with known content
        String fileName = "test_hello.txt";
        String expectedContent = "hello, welcome to \"hello.txt\".\nhello again...\nwelcome again.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(expectedContent);
        }

        // Read and verify the content
        String actualContent = FileReader.readFile(fileName);
        assertEquals(expectedContent, actualContent, "File content should match");

        // Cleanup test file
        new File(fileName).delete();
    }

    @Test
    void testReadFile_NonExistentFile() {
        String result = FileReader.readFile("fake_file.txt");
        assertEquals("File not found", result, "Should return 'File not found' for non-existing file");
    }
}
