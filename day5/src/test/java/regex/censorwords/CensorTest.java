package regex.censorwords;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CensorTest {

    @Test
    void testCensorBadWords() {
        String input = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");
        String expected = "This is a **** bad example with some **** words.";
        assertEquals(expected, Censor.censorBadWords(input, badWords));
    }

    @Test
    void testNoBadWords() {
        String input = "This is a clean sentence.";
        List<String> badWords = Arrays.asList("damn", "stupid");
        assertEquals("This is a clean sentence.", Censor.censorBadWords(input, badWords));
    }

    @Test
    void testCaseInsensitiveCensoring() {
        String input = "This is a Damn bad example with some Stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");
        String expected = "This is a **** bad example with some **** words.";
        assertEquals(expected, Censor.censorBadWords(input, badWords));
    }
}
