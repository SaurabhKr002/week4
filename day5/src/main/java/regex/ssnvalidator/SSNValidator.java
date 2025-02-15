package regex.ssnvalidator;

import java.util.regex.*;

public class SSNValidator {
    // Regular expression for valid SSN (Format: XXX-XX-XXXX)
    private static final String SSN_REGEX = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

    public static boolean isValidSSN(String ssn) {
        Pattern pattern = Pattern.compile(SSN_REGEX);
        Matcher matcher = pattern.matcher(ssn);
        return matcher.find();
    }
}
