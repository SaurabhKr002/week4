package wordcounter;

import java.io.*;
import java.util.*;

public class WordCounter {
    public static void countTopWords(String filePath, int topN) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z]", " ").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
            sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            System.out.println("🔹 Top " + topN + " Most Frequent Words:");
            for (int i = 0; i < Math.min(topN, sortedWords.size()); i++) {
                System.out.println(sortedWords.get(i).getKey() + " -> " + sortedWords.get(i).getValue());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
