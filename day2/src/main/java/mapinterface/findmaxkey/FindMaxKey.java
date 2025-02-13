// Program to find the key with the highest value in a HashMap
package mapinterface.findmaxkey;

import java.util.*;

public class FindMaxKey {
    // Method to find the key with the highest value
    public static String getMaxKey(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null; // Return null for empty maps
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // Iterate through the map to find the max value
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("Saurabh", 10);
        sampleMap.put("Anand", 20);
        sampleMap.put("Kuldeep", 15);

        System.out.println("Key with max value: " + getMaxKey(sampleMap)); // Output: Anand
    }
}
