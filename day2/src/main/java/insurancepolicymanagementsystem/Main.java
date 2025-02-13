package insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PolicyStorage storage = new PolicyStorage();
        PolicyRetrieval retrieval = new PolicyRetrieval(storage);

        Policy p1 = new Policy("P1001", "Saurabh", LocalDate.of(2025, 6, 15), "Health", 5000.0);
        Policy p2 = new Policy("P1002", "Amit", LocalDate.of(2024, 3, 10), "Auto", 3000.0);
        Policy p3 = new Policy("P1003", "Anand", LocalDate.of(2024, 4, 20), "Home", 4000.0);
        Policy p4 = new Policy("P1002", "Kuldeep", LocalDate.of(2024, 3, 10), "Auto", 3000.0); // Duplicate

        storage.addPolicy(p1);
        storage.addPolicy(p2);
        storage.addPolicy(p3);
        storage.addPolicy(p4);

        printSection("All Policies", storage.getAllPolicies());
        printSection("Expiring Soon (30 days)", retrieval.getExpiringSoon(30));
        printSection("Auto Policies", retrieval.getPoliciesByCoverageType("Auto"));
        printSection("Duplicate Policies", retrieval.getDuplicatePolicies());
    }

    private static void printSection(String title, Set<Policy> policies) {
        System.out.println("========== " + title + " ==========");
        if (policies.isEmpty()) {
            System.out.println("No policies found.");
        } else {
            for (Policy policy : policies) {
                System.out.println(policy);
            }
        }
        System.out.println("=================================\n");
    }
}