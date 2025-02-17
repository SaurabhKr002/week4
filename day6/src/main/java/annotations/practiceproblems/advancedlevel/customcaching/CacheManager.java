package annotations.practiceproblems.advancedlevel.customcaching;

import java.util.HashMap;
import java.util.Map;

// Simple CacheManager to store method results
public class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    // Store result in cache
    public static void put(String key, Object value) {
        cache.put(key, value);
    }

    // Retrieve result from cache
    public static Object get(String key) {
        return cache.get(key);
    }

    // Check if cache contains a result
    public static boolean contains(String key) {
        return cache.containsKey(key);
    }
}
