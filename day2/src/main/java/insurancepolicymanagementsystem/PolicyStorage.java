package insurancepolicymanagementsystem;

import java.util.*;

public class PolicyStorage {
    private Set<Policy> policyHashSet = new HashSet<>();
    private Set<Policy> policyLinkedHashSet = new LinkedHashSet<>();
    private Set<Policy> policyTreeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        policyHashSet.add(policy);
        policyLinkedHashSet.add(policy);
        policyTreeSet.add(policy);
    }

    public Set<Policy> getAllPolicies() {
        return new HashSet<>(policyHashSet);
    }

    public Set<Policy> getPolicyLinkedHashSet() {
        return new LinkedHashSet<>(policyLinkedHashSet);
    }

    public Set<Policy> getPolicyTreeSet() {
        return new TreeSet<>(policyTreeSet);
    }
}
