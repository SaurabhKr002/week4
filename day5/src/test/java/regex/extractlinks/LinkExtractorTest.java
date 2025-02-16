package regex.extractlinks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkExtractorTest {

    @Test
    void testExtractLinks() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        String result = LinkExtractor.extractLinks(text);

        String expected = "https://www.google.com, http://example.org";
        assertEquals(expected, result);
    }

    @Test
    void testNoLinks() {
        String text = "This is a text without any URLs.";
        String result = LinkExtractor.extractLinks(text);

        assertEquals("", result);
    }

    @Test
    void testMultipleLinks() {
        String text = "Check out https://github.com, http://openai.com, and https://www.oracle.com.";
        String result = LinkExtractor.extractLinks(text);

        String expected = "https://github.com, http://openai.com, https://www.oracle.com";
        assertEquals(expected, result);
    }
}
