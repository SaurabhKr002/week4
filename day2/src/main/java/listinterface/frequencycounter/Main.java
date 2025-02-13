package listinterface.frequencycounter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");

        System.out.println("Input List: " + items);
        Map<String, Integer> frequencyMap = FrequencyCounter.countFrequencies(items);
        System.out.println("Frequency Count: " + frequencyMap);
    }
}
