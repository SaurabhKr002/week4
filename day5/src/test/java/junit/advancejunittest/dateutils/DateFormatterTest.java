package junit.advancejunittest.dateutils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateFormatterTest {

    @Test
    void testValidDateConversion() {
        assertEquals("16-02-2025", DateFormatter.formatDate("2025-02-16"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
        assertEquals("31-12-1999", DateFormatter.formatDate("1999-12-31"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("16-02-2025"));
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2025/02/16"));
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("InvalidDate"));
    }
}
