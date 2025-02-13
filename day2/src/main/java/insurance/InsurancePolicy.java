// Insurance Policy Management System using HashMap, LinkedHashMap, and TreeMap
package insurance;

import java.time.LocalDate;
import java.util.*;

class InsurancePolicy {
    private String policyNumber;
    private String policyHolder;
    private LocalDate expiryDate;

    // Constructor
    public InsurancePolicy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    // Getters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return policyNumber + " - " + policyHolder + " (Expiry: " + expiryDate + ")";
    }
}
