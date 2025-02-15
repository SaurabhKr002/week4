package regex.extractdates;

public class Main {
    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        String result = DateExtractor.extractDates(text);

        System.out.println("Extracting dates from: " + text);
        System.out.println("Extracted dates:");
        System.out.println(result);
    }
}
