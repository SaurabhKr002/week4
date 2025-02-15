package regex.validatecreditcard;

import java.util.regex.Pattern;

public class CreditCardValidator {
    // Regex patterns for Visa and MasterCard
    private static final String VISA_REGEX = "^4\\d{15}$";   // Starts with 4, 16 digits
    private static final String MASTERCARD_REGEX = "^5\\d{15}$";  // Starts with 5, 16 digits

    private static final Pattern visaPattern = Pattern.compile(VISA_REGEX);
    private static final Pattern masterCardPattern = Pattern.compile(MASTERCARD_REGEX);

    public static String validateCreditCard(String cardNumber) {
        if (visaPattern.matcher(cardNumber).matches()) {
            return "Valid Visa Card";
        } else if (masterCardPattern.matcher(cardNumber).matches()) {
            return "Valid MasterCard";
        } else {
            return "Invalid Card Number";
        }
    }
}
