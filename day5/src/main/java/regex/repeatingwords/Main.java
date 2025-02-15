package regex.repeatingwords;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Example input text
        String inputText = "This is is a repeated repeated word test.";

        // Extract repeating words
        Set<String> repeatingWords = RepeatingWordsFinder.findRepeatingWords(inputText);

        System.out.println("Fetching the repeating words from: "+inputText);

        // Displaying the result
        System.out.println("Repeating Words: " + String.join(", ", repeatingWords));
    }
}
