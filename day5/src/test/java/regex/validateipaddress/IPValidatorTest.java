package regex.validateipaddress;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IPValidatorTest {

    @Test
    void testValidIPAddresses() {
        assertTrue(IPValidator.isValidIPAddress("192.168.1.1"));
        assertTrue(IPValidator.isValidIPAddress("255.255.255.255"));
        assertTrue(IPValidator.isValidIPAddress("0.0.0.0"));
        assertTrue(IPValidator.isValidIPAddress("10.10.10.10"));
    }

    @Test
    void testInvalidIPAddresses() {
        assertFalse(IPValidator.isValidIPAddress("256.100.50.25")); // 256 out of range
        assertFalse(IPValidator.isValidIPAddress("192.168.1")); // Missing last octet
        assertFalse(IPValidator.isValidIPAddress("192.168.1.300")); // 300 out of range
        assertFalse(IPValidator.isValidIPAddress("10..10.10")); // Empty octet
        assertFalse(IPValidator.isValidIPAddress("192.168.1.a")); // Contains non-numeric character
    }
}
