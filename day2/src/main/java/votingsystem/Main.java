package votingsystem;

public class Main {
    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();

        // Casting votes
        voteManager.castVote("Alice");
        voteManager.castVote("Bob");
        voteManager.castVote("Alice");
        voteManager.castVote("Carol");
        voteManager.castVote("Alice");
        voteManager.castVote("Bob");

        // Displaying votes in the order they were cast
        System.out.println("Vote Order: " + voteManager.getVoteOrder());

        // Displaying sorted results by candidate name
        System.out.println("Sorted Results: " + voteManager.getSortedResults());

        // Displaying the winner
        System.out.println("Winner: " + voteManager.getWinner());
    }
}
