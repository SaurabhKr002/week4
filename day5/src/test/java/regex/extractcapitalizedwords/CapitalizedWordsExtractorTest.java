package regex.extractcapitalizedwords;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizedWordsExtractorTest {

    @Test
    void testExtractCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String result = CapitalizedWordsExtractor.extractCapitalizedWords(text);

        String expected = "The, Eiffel, Tower, Paris, Statue, Liberty, New, York";
        assertEquals(expected, result);
    }

    @Test
    void testNoCapitalizedWords() {
        String text = "this is a sentence without capitalized words.";
        String result = CapitalizedWordsExtractor.extractCapitalizedWords(text);

        assertEquals("", result);
    }

    @Test
    void testAllCapitalizedWords() {
        String text = "London Rome Tokyo";
        String result = CapitalizedWordsExtractor.extractCapitalizedWords(text);

        String expected = "London, Rome, Tokyo";
        assertEquals(expected, result);
    }
}
