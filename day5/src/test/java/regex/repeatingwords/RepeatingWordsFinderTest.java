package regex.repeatingwords;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

class RepeatingWordsFinderTest {

    @Test
    void testRepeatingWords() {
        String text = "This is is a repeated repeated word test.";
        Set<String> result = RepeatingWordsFinder.findRepeatingWords(text);
        assertEquals(Set.of("is", "repeated"), result);
    }

    @Test
    void testNoRepeatingWords() {
        String text = "Each word is unique.";
        Set<String> result = RepeatingWordsFinder.findRepeatingWords(text);
        assertTrue(result.isEmpty());
    }

    @Test
    void testMixedCaseWords() {
        String text = "Hello hello HELLO world WORLD.";
        Set<String> result = RepeatingWordsFinder.findRepeatingWords(text);
        assertEquals(Set.of("hello", "world"), result);
    }

    @Test
    void testPunctuationHandling() {
        String text = "Stop! Stop. STOP?";
        Set<String> result = RepeatingWordsFinder.findRepeatingWords(text);
        assertEquals(Set.of("stop"), result);
    }
}
