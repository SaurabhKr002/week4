package votingsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class VoteManagerTest {
    @Test
    void testVoteCasting() {
        VoteManager voteManager = new VoteManager();
        voteManager.castVote("Alice");
        voteManager.castVote("Bob");
        voteManager.castVote("Alice");

        assertEquals(2, voteManager.getVoteOrder().get("Alice"), "Vote count for Alice is incorrect.");
        assertEquals(1, voteManager.getVoteOrder().get("Bob"), "Vote count for Bob is incorrect.");
    }

    @Test
    void testVoteOrder() {
        VoteManager voteManager = new VoteManager();
        voteManager.castVote("Alice");
        voteManager.castVote("Bob");
        voteManager.castVote("Carol");

        Map<String, Integer> order = voteManager.getVoteOrder();
        List<String> keys = new ArrayList<>(order.keySet());

        assertEquals(Arrays.asList("Alice", "Bob", "Carol"), keys, "Vote order does not match expected sequence.");
    }

    @Test
    void testSortedResults() {
        VoteManager voteManager = new VoteManager();
        voteManager.castVote("Carol");
        voteManager.castVote("Alice");
        voteManager.castVote("Bob");

        Map<String, Integer> sorted = voteManager.getSortedResults();
        List<String> keys = new ArrayList<>(sorted.keySet());

        assertEquals(Arrays.asList("Alice", "Bob", "Carol"), keys, "Sorted results order is incorrect.");
    }

    @Test
    void testWinner() {
        VoteManager voteManager = new VoteManager();
        voteManager.castVote("Alice");
        voteManager.castVote("Alice");
        voteManager.castVote("Bob");

        assertEquals("Alice", voteManager.getWinner(), "Winner determination is incorrect.");
    }
}
