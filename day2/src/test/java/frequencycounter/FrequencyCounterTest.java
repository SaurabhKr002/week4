package frequencycounter;

import listinterface.frequencycounter.FrequencyCounter;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class FrequencyCounterTest {

    @Test
    void testCountFrequencies_NormalList() {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> result = FrequencyCounter.countFrequencies(items);
        assertEquals(2, result.get("apple"));
        assertEquals(1, result.get("banana"));
        assertEquals(1, result.get("orange"));
    }

    @Test
    void testCountFrequencies_EmptyList() {
        List<String> items = Collections.emptyList();
        Map<String, Integer> result = FrequencyCounter.countFrequencies(items);
        assertTrue(result.isEmpty());
    }

    @Test
    void testCountFrequencies_SingleElementList() {
        List<String> items = Collections.singletonList("mango");
        Map<String, Integer> result = FrequencyCounter.countFrequencies(items);
        assertEquals(1, result.get("mango"));
    }

    @Test
    void testCountFrequencies_AllSameElements() {
        List<String> items = Arrays.asList("grape", "grape", "grape");
        Map<String, Integer> result = FrequencyCounter.countFrequencies(items);
        assertEquals(3, result.get("grape"));
    }

    @Test
    void testCountFrequencies_MixedCase() {
        List<String> items = Arrays.asList("Apple", "apple", "APPLE");
        Map<String, Integer> result = FrequencyCounter.countFrequencies(items);
        assertEquals(1, result.get("Apple"));
        assertEquals(1, result.get("apple"));
        assertEquals(1, result.get("APPLE"));
    }
}
