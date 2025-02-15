package regex.extractcapitalizedwords;

public class Main {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        String result = CapitalizedWordsExtractor.extractCapitalizedWords(text);

        System.out.println("Extracting capitalized words from: " + text);
        System.out.println("Extracted capitalized words:");
        System.out.println(result);
    }
}
