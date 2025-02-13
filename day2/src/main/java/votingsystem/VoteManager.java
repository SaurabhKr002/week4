package votingsystem;

import java.util.*;

class VoteManager {
    private Map<String, Integer> voteCount = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedResults = new TreeMap<>();

    // Casts a vote for a candidate
    public void castVote(String candidateName) {
        voteCount.put(candidateName, voteCount.getOrDefault(candidateName, 0) + 1);
        voteOrder.put(candidateName, voteCount.get(candidateName));
    }

    // Gets votes in the order they were cast
    public Map<String, Integer> getVoteOrder() {
        return new LinkedHashMap<>(voteOrder);
    }

    // Gets results sorted by candidate name
    public Map<String, Integer> getSortedResults() {
        sortedResults.clear();
        sortedResults.putAll(voteCount);
        return new TreeMap<>(sortedResults);
    }

    // Finds the winner based on the highest votes
    public String getWinner() {
        return Collections.max(voteCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
