package regex.currencyextractor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class CurrencyExtractorTest {

    @Test
    void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> result = CurrencyExtractor.extractCurrencyValues(text);
        assertEquals(List.of("$45.99", "10.50"), result);
    }

    @Test
    void testNoCurrencyFound() {
        String text = "There is no price mentioned here.";
        List<String> result = CurrencyExtractor.extractCurrencyValues(text);
        assertTrue(result.isEmpty());
    }

    @Test
    void testMultipleCurrencyFormats() {
        String text = "Items cost $5.00, 99.99, and $1234.56.";
        List<String> result = CurrencyExtractor.extractCurrencyValues(text);
        assertEquals(List.of("$5.00", "99.99", "$1234.56"), result);
    }
}
