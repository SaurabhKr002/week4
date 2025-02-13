package wordcounter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

class WordCounterTest {
    private static final String TEST_FILE = "test_hello.txt";

    @BeforeEach
    void setUp() throws IOException {
        List<String> lines = Arrays.asList(
                "hello, welcome to \"hello 1.txt\".",
                "hello again...",
                "welcome again."
        );
        Files.write(Paths.get(TEST_FILE), lines);
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testCountTopWords() {
        // Capture output to verify correctness
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        WordCounter.countTopWords(TEST_FILE, 3);

        // Reset System.out to normal
        System.setOut(System.out);

        String output = outputStream.toString().toLowerCase();
        assertTrue(output.contains("hello -> 3"), "Hello should appear 3 times");
        assertTrue(output.contains("welcome -> 2"), "Welcome should appear 2 times");
        assertTrue(output.contains("again -> 2"), "Again should appear 2 times");
    }
}
