package annotations.practiceproblems.advancedlevel.rolebasedaccesscontrol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecureServiceTest {

    @Test
    void testAdminAccessAllowed() {
        SecureService service = new SecureService();
        User adminUser = new User("Saurabh", "ADMIN");

        // Simulate method execution and capture output
        service.performAdminTask(adminUser);
    }

    @Test
    void testNonAdminAccessDenied() {
        SecureService service = new SecureService();
        User regularUser = new User("Anand", "USER");

        // Simulate method execution and capture output
        service.performAdminTask(regularUser);
    }
}
