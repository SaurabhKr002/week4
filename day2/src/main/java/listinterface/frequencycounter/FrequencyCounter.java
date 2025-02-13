package listinterface.frequencycounter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequencies(List<String> items) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }
}
