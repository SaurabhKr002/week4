package mapinterface.mergemaps;

import java.util.*;

public class MergeMaps {
    // Method to merge two maps
    public static Map<String, Integer> merge(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);

        // Iterate over map2 and merge values
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return result;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Saurabh", 1);
        map1.put("Anand", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Anand", 3);
        map2.put("Kuldeep", 4);

        System.out.println("Merged Map: " + merge(map1, map2)); // Output: {Saurabh=1, Anand=5, Kuldeep=4}
    }
}
