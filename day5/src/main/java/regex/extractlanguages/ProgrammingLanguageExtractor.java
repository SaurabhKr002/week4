package regex.extractlanguages;

import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class ProgrammingLanguageExtractor {

    public static List<String> extractLanguages(String text) {
        // List of programming languages to detect
        List<String> languages = List.of(
                "JavaScript", "Java", "Python", "C\\+\\+", "C#", "C", "Go", "TypeScript", "Ruby", "Swift", "Kotlin", "PHP"
        );

        // Construct a case-insensitive regex pattern
        String regex = "\\b(" + String.join("|", languages) + ")\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        List<String> foundLanguages = new ArrayList<>();

        while (matcher.find()) {
            String matched = matcher.group();
            // Normalize case-sensitive names (e.g., "javascript" -> "JavaScript")
            for (String lang : languages) {
                if (lang.equalsIgnoreCase(matched)) {
                    foundLanguages.add(lang);
                    break;
                }
            }
        }

        return foundLanguages;
    }
}
