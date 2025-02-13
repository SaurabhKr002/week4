// JUnit test for FindMaxKey
package findmaxkey;

import static org.junit.jupiter.api.Assertions.*;

import mapinterface.findmaxkey.FindMaxKey;
import org.junit.jupiter.api.Test;
import java.util.*;

class FindMaxKeyTest {
    @Test
    void testGetMaxKey() {
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("Saurabh", 10);
        testMap.put("Anand", 20);
        testMap.put("Kuldeep", 15);

        assertEquals("Anand", FindMaxKey.getMaxKey(testMap));
    }

    @Test
    void testEmptyMap() {
        Map<String, Integer> emptyMap = new HashMap<>();
        assertNull(FindMaxKey.getMaxKey(emptyMap));
    }

    @Test
    void testSingleEntry() {
        Map<String, Integer> singleEntry = new HashMap<>();
        singleEntry.put("Saurabh", 50);
        assertEquals("Saurabh", FindMaxKey.getMaxKey(singleEntry));
    }

    @Test
    void testNegativeValues() {
        Map<String, Integer> negativeMap = new HashMap<>();
        negativeMap.put("Saurabh", -10);
        negativeMap.put("Anand", -5);
        negativeMap.put("Kuldeep", -20);

        assertEquals("Anand", FindMaxKey.getMaxKey(negativeMap));
    }
}
