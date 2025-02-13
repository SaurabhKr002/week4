package insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.Objects;

public class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String holder;
    private LocalDate expiryDate;
    private String coverageType;
    private double premium;

    public Policy(String policyNumber, String holder, LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.holder = holder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber +
                "\nHolder: " + holder +
                "\nExpiry Date: " + expiryDate +
                "\nCoverage Type: " + coverageType +
                "\nPremium: " + premium + "\n";
    }
}
