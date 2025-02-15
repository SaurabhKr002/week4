package regex.extractlinks;

public class Main {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        String result = LinkExtractor.extractLinks(text);

        System.out.println("Extracting links from: " + text);
        System.out.println("Extracted links:");
        System.out.println(result);
    }
}
