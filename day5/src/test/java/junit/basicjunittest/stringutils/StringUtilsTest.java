package junit.basicjunittest.stringutils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    // Testing reverse method
    @Test
    void testReverse() {
        StringUtils utils = new StringUtils();
        assertEquals("cba", utils.reverse("abc"), "Reverse function failed");
        assertEquals("", utils.reverse(""), "Reverse function failed for empty string");
        assertNull(utils.reverse(null), "Reverse function failed for null input");
    }

    // Testing isPalindrome method
    @Test
    void testIsPalindrome() {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPalindrome("madam"), "Palindrome check failed");
        assertFalse(utils.isPalindrome("hello"), "Palindrome check failed");
        assertTrue(utils.isPalindrome(""), "Empty string should be a palindrome");
        assertFalse(utils.isPalindrome(null), "Null input should return false");
    }

    // Testing toUpperCase method
    @Test
    void testToUpperCase() {
        StringUtils utils = new StringUtils();
        assertEquals("HELLO", utils.toUpperCase("hello"), "Uppercase conversion failed");
        assertEquals("", utils.toUpperCase(""), "Uppercase conversion failed for empty string");
        assertNull(utils.toUpperCase(null), "Uppercase conversion failed for null input");
    }
}
