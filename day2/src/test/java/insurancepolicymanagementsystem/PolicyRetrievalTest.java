package insurancepolicymanagementsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Set;

public class PolicyRetrievalTest {

    private PolicyStorage storage;
    private PolicyRetrieval retrieval;

    @BeforeEach
    void setUp() {
        storage = new PolicyStorage();
        retrieval = new PolicyRetrieval(storage);

        // Adding policies
        storage.addPolicy(new Policy("P1001", "Saurabh", LocalDate.now().plusDays(10), "Health", 5000.0)); // Expiring soon
        storage.addPolicy(new Policy("P1002", "Amit", LocalDate.now().plusDays(40), "Auto", 3000.0)); // Not expiring soon
        storage.addPolicy(new Policy("P1003", "Anand", LocalDate.now().plusDays(25), "Home", 4000.0)); // Expiring soon
        storage.addPolicy(new Policy("P1004", "Amit", LocalDate.now().plusDays(5), "Auto", 3200.0)); // Expiring soon

        // Duplicate policy
        storage.addPolicy(new Policy("P1002", "Amit", LocalDate.now().plusDays(40), "Auto", 3000.0));
    }

    @Test
    void testGetExpiringSoon() {
        Set<Policy> expiringPolicies = retrieval.getExpiringSoon(30);

        System.out.println("Expiring Soon Policies: " + expiringPolicies);
        assertEquals(3, expiringPolicies.size(),
                "Expected 3 policies to be expiring soon, but found: " + expiringPolicies.size());
    }

    @Test
    void testGetPoliciesByCoverageType() {
        Set<Policy> autoPolicies = retrieval.getPoliciesByCoverageType("Auto");

        System.out.println("Auto Policies: " + autoPolicies);
        assertEquals(2, autoPolicies.size(),
                "Expected 2 auto policies, but found: " + autoPolicies.size());
    }

    @Test
    void testGetDuplicatePolicies() {
        Set<Policy> duplicatePolicies = retrieval.getDuplicatePolicies();

        System.out.println("Duplicate Policies: " + duplicatePolicies);
        assertEquals(0, duplicatePolicies.size(),
                "Expected 1 duplicate policy but found: " + duplicatePolicies.size());
    }
}
