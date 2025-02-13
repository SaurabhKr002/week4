// Program to invert a Map<K, V> to Map<V, List<K>>
package mapinterface.invertmap;

import java.util.*;

public class InvertMap {
    // Method to invert a given map
    public static <K, V> Map<V, List<K>> invert(Map<K, V> inputMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        return invertedMap;
    }

    // Main method for testing
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Saurabh", 1);
        originalMap.put("Anand", 2);
        originalMap.put("Kuldeep", 1);

        // Inverting the map
        Map<Integer, List<String>> invertedMap = invert(originalMap);

        // Printing the result
        System.out.println(invertedMap);
    }
}
