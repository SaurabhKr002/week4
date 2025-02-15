package regex.validateipaddress;

public class Main {
    public static void main(String[] args) {
        String[] testIPs = {
                "192.168.1.1",  // Valid
                "255.255.255.255",  // Valid
                "256.100.50.25",  // Invalid (256 out of range)
                "192.168.1",  // Invalid (missing last octet)
                "192.168.1.300",  // Invalid (300 out of range)
                "1.1.1.1",  // Valid
                "0.0.0.0",  // Valid
                "10.10.10.256",  // Invalid (256 out of range)
                "10..10.10",  // Invalid (empty octet)
                "192.168.1.a"  // Invalid (contains non-numeric character)
        };

        for (String ip : testIPs) {
            System.out.println(ip + " --> " + (IPValidator.isValidIPAddress(ip) ? "Valid" : "Invalid"));
        }
    }
}
