package regex.validateipaddress;

import java.util.regex.Pattern;

public class IPValidator {
    private static final String IP_REGEX =
            "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +  // First octet
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +   // Second octet
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +   // Third octet
                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";     // Fourth octet

    private static final Pattern pattern = Pattern.compile(IP_REGEX);

    public static boolean isValidIPAddress(String ip) {
        return pattern.matcher(ip).matches();
    }
}
