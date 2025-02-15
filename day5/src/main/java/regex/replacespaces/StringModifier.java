package regex.replacespaces;

public class StringModifier {
    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
}
