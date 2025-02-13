// JUnit test for InsurancePolicyManager
package insurance;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.*;

class InsurancePolicyManagerTest {
    @Test
    void testAddAndRetrievePolicy() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        InsurancePolicy policy = new InsurancePolicy("P1001", "Saurabh", LocalDate.now().plusDays(20));

        manager.addPolicy(policy);
        assertEquals(policy, manager.getPolicy("P1001"));
    }

    @Test
    void testGetExpiringPolicies() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        manager.addPolicy(new InsurancePolicy("P1001", "Saurabh", LocalDate.now().plusDays(10)));
        manager.addPolicy(new InsurancePolicy("P1002", "Anand", LocalDate.now().plusDays(40)));

        List<InsurancePolicy> expiring = manager.getExpiringPolicies();
        assertEquals(1, expiring.size());
        assertEquals("Saurabh", expiring.get(0).getPolicyHolder());
    }

    @Test
    void testGetPoliciesByHolder() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        manager.addPolicy(new InsurancePolicy("P1001", "Anand", LocalDate.now().plusDays(30)));
        manager.addPolicy(new InsurancePolicy("P1002", "Anand", LocalDate.now().plusDays(40)));

        List<InsurancePolicy> policies = manager.getPoliciesByHolder("Anand");
        assertEquals(2, policies.size());
    }

    @Test
    void testRemoveExpiredPolicies() {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        manager.addPolicy(new InsurancePolicy("P1001", "Saurabh", LocalDate.now().minusDays(5)));
        manager.addPolicy(new InsurancePolicy("P1002", "Anand", LocalDate.now().plusDays(40)));

        manager.removeExpiredPolicies();
        assertNull(manager.getPolicy("P1001"));
        assertNotNull(manager.getPolicy("P1002"));
    }
}
