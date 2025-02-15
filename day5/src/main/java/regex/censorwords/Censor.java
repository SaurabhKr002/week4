package regex.censorwords;

import java.util.List;

public class Censor {
    public static String censorBadWords(String text, List<String> badWords) {
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return text;
    }
}
