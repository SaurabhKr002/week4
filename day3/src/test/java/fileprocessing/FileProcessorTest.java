package fileprocessing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

class FileProcessorTest {

    @Test
    void testFileProcessing() throws IOException {
        String testContent = "Info: System started\nError: Disk failure\nWarning: Low memory\nerror: Connection lost";
        File testFile = File.createTempFile("testLog", ".txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFile))) {
            writer.write(testContent);
        }

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        FileProcessor processor = new FileProcessor(testFile.getAbsolutePath());
        processor.processFile();

        String consoleOutput = output.toString();
        assertTrue(consoleOutput.contains("Error: Disk failure"));
        assertTrue(consoleOutput.contains("error: Connection lost"));

        testFile.deleteOnExit();
    }
}
