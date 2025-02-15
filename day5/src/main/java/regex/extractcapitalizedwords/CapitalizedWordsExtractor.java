package regex.extractcapitalizedwords;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordsExtractor {
    public static String extractCapitalizedWords(String text) {
        List<String> capitalizedWords = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b"); // Matches words starting with a capital letter
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        return String.join(", ", capitalizedWords); // Return as a comma-separated string
    }
}
