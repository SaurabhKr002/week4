package regex.replacespaces;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringModifierTest {

    @Test
    void testReplaceMultipleSpaces() {
        String input = "This    is  an   example   with    multiple    spaces.";
        String expected = "This is an example with multiple spaces.";
        assertEquals(expected, StringModifier.replaceMultipleSpaces(input));
    }

    @Test
    void testNoExtraSpaces() {
        String input = "This is fine.";
        assertEquals("This is fine.", StringModifier.replaceMultipleSpaces(input));
    }

    @Test
    void testLeadingAndTrailingSpaces() {
        String input = "   Hello   World   ";
        String expected = "Hello World";
        assertEquals(expected, StringModifier.replaceMultipleSpaces(input));
    }
}
