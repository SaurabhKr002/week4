package regex.extractlinks;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    public static String extractLinks(String text) {
        List<String> links = new ArrayList<>();
        Pattern pattern = Pattern.compile("(https?://[\\w.-]+(?:\\.[a-zA-Z]{2,})+(?:/[\\w&=?.%-]*)*)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            links.add(matcher.group());
        }

        return String.join(", ", links);
    }
}
