package regex.currencyextractor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example input text
        String inputText = "The price is $45.99, and the discount is 10.50.";

        // Extracting currency values
        List<String> currencyValues = CurrencyExtractor.extractCurrencyValues(inputText);

        // Displaying the result
        System.out.println("Extracting currency values from: " + inputText);
        System.out.println("Extracted Currency Values: " + String.join(", ", currencyValues));
    }
}
