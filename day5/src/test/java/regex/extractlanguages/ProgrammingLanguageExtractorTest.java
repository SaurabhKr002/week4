package regex.extractlanguages;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class ProgrammingLanguageExtractorTest {

    @Test
    void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> result = ProgrammingLanguageExtractor.extractLanguages(text);
        assertEquals(List.of("Java", "Python", "JavaScript", "Go"), result);
    }

    @Test
    void testNoLanguagesFound() {
        String text = "I enjoy painting and music.";
        List<String> result = ProgrammingLanguageExtractor.extractLanguages(text);
        assertTrue(result.isEmpty());
    }

    @Test
    void testMixedCase() {
        String text = "java, PYTHON, and Javascript are amazing.";
        List<String> result = ProgrammingLanguageExtractor.extractLanguages(text);
        assertEquals(List.of("Java", "Python", "JavaScript"), result);
    }
}
