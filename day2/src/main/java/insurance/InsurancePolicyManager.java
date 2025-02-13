package insurance;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>();
    private Map<String, InsurancePolicy> orderedPolicies = new LinkedHashMap<>();
    private TreeMap<LocalDate, InsurancePolicy> sortedPolicies = new TreeMap<>();

    // Add a new policy
    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicies.put(policy.getPolicyNumber(), policy);
        sortedPolicies.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by policy number
    public InsurancePolicy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<InsurancePolicy> getExpiringPolicies() {
        List<InsurancePolicy> expiring = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);

        for (Map.Entry<LocalDate, InsurancePolicy> entry : sortedPolicies.entrySet()) {
            if (!entry.getKey().isAfter(threshold)) {
                expiring.add(entry.getValue());
            }
        }
        return expiring;
    }

    // List all policies for a specific policyholder
    public List<InsurancePolicy> getPoliciesByHolder(String policyHolder) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.getPolicyHolder().equalsIgnoreCase(policyHolder)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        sortedPolicies.entrySet().removeIf(entry -> entry.getKey().isBefore(today));
        policyMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        orderedPolicies.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
    }

    // Main method for demonstration
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new InsurancePolicy("P1001", "Saurabh", LocalDate.now().plusDays(10)));
        manager.addPolicy(new InsurancePolicy("P1002", "Anand", LocalDate.now().plusDays(40)));
        manager.addPolicy(new InsurancePolicy("P1003", "Kuldeep", LocalDate.now().minusDays(5)));

        System.out.println("Policy Details: " + manager.getPolicy("P1001"));
        System.out.println("Expiring Policies: " + manager.getExpiringPolicies());
        System.out.println("Policies of Anand: " + manager.getPoliciesByHolder("Anand"));

        manager.removeExpiredPolicies();
        System.out.println("Policies after removing expired: " + manager.policyMap.values());
    }
}
