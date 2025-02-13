// JUnit test for Word Frequency Counter
package wordfrequencycounter;

import static org.junit.jupiter.api.Assertions.*;

import mapinterface.wordfrequencycounter.WordFrequencyCounter;
import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.util.*;

class WordFrequencyCounterTest {
    @Test
    void testWordFrequency() {
        String testFilePath = "test.txt";

        // Creating a sample test file
        try (PrintWriter writer = new PrintWriter(testFilePath)) {
            writer.println("Hello world, hello Java!");
        } catch (Exception e) {
            fail("Error creating test file");
        }

        // Expected result
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        expected.put("java", 1);

        // Running the method and asserting
        assertEquals(expected, WordFrequencyCounter.countWordFrequency(testFilePath));
    }
}
