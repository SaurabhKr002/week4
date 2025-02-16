package regex.extractdates;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateExtractorTest {

    @Test
    void testExtractDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String result = DateExtractor.extractDates(text);

        String expected = "12/05/2023, 15/08/2024, 29/02/2020";
        assertEquals(expected, result);
    }

    @Test
    void testNoDates() {
        String text = "No events are scheduled.";
        String result = DateExtractor.extractDates(text);

        assertEquals("", result);
    }

    @Test
    void testMixedTextWithDates() {
        String text = "Important dates: 01/01/2000 and 31/12/1999.";
        String result = DateExtractor.extractDates(text);

        String expected = "01/01/2000, 31/12/1999";
        assertEquals(expected, result);
    }
}
