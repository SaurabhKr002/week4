package regex.replacespaces;

public class Main {
    public static void main(String[] args) {
        String input = "This    is  an   example   with    multiple    spaces.";
        String result = StringModifier.replaceMultipleSpaces(input);

        System.out.println("Replacing multiple spaces from: " + input);
        System.out.println("Modified String:");
        System.out.println(result);
    }
}
