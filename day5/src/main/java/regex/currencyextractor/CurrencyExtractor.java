package regex.currencyextractor;

import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class CurrencyExtractor {

    public static List<String> extractCurrencyValues(String text) {
        // Regex to match currency values with or without a dollar sign
        String regex = "\\$?\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> currencyValues = new ArrayList<>();

        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        return currencyValues;
    }
}
