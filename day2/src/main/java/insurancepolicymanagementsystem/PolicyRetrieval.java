package insurancepolicymanagementsystem;

import java.util.HashSet;
import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

public class PolicyRetrieval {
    private PolicyStorage storage;

    public PolicyRetrieval(PolicyStorage storage) {
        this.storage = storage;
    }

    public Set<Policy> getExpiringSoon(int days) {
        LocalDate now = LocalDate.now();
        return storage.getPolicyTreeSet().stream()
                .filter(policy -> policy.getExpiryDate().isBefore(now.plusDays(days)))
                .collect(Collectors.toSet());
    }

    public Set<Policy> getPoliciesByCoverageType(String coverageType) {
        return storage.getAllPolicies().stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))
                .collect(Collectors.toSet());
    }

    public Set<Policy> getDuplicatePolicies() {
        Set<String> seen = new HashSet<>();
        return storage.getAllPolicies().stream()
                .filter(policy -> !seen.add(policy.getPolicyNumber()))
                .collect(Collectors.toSet());
    }
}
