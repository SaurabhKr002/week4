package regex.censorwords;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");

        String result = Censor.censorBadWords(input, badWords);

        System.out.println("Censoring bad words from: " + input);
        System.out.println("Censored Text:");
        System.out.println(result);
    }
}
