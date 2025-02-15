package regex.extractdates;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {
    public static String extractDates(String text) {
        List<String> dates = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b(\\d{2}/\\d{2}/\\d{4})\\b"); // Matches dd/mm/yyyy format
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            dates.add(matcher.group());
        }

        return String.join(", ", dates); // Return as a comma-separated string
    }
}
