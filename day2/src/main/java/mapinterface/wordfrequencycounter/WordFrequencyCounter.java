// Program to count word frequency using HashMap
package mapinterface.wordfrequencycounter;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    // Method to count word frequencies from a text file
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Remove punctuation and convert to lowercase
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }

    // Main method for testing
    public static void main(String[] args) {
        String filePath = "D:\\Capg\\week4\\day2\\src\\main\\java\\mapinterface\\wordfrequencycounter\\hello.txt"; // Path to the text file
        Map<String, Integer> wordFrequencies = countWordFrequency(filePath);

        // Print the word frequency map
        System.out.println(wordFrequencies);
    }
}
