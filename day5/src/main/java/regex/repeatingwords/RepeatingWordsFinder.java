package regex.repeatingwords;

import java.util.*;
import java.util.regex.*;

public class RepeatingWordsFinder {
    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatingWords = new LinkedHashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        // Regular expression to match words (case insensitive)
        Pattern pattern = Pattern.compile("\\b(\\w+)\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        // Count occurrences of each word
        while (matcher.find()) {
            String word = matcher.group(1).toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Add words that appear more than once
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatingWords.add(entry.getKey());
            }
        }

        return repeatingWords;
    }
}