package regex.extractlanguages;

public class Main {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println("Extracting languages from: " + text);
        System.out.println("Extracted Languages: " + ProgrammingLanguageExtractor.extractLanguages(text));
    }
}
