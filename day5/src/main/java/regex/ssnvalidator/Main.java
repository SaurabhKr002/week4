package regex.ssnvalidator;

public class Main {
    public static void main(String[] args) {
        String input1 = "My SSN is 123-45-6789.";
        String input2 = "My old SSN was 123456789.";

        checkSSN(input1);
        checkSSN(input2);
    }

    private static void checkSSN(String input) {
        if (SSNValidator.isValidSSN(input)) {
            System.out.println("\"" + input.replaceAll("[^0-9-]", "") + "\" is valid");
        } else {
            System.out.println("\"" + input.replaceAll("[^0-9-]", "") + "\" is invalid");
        }
    }
}
