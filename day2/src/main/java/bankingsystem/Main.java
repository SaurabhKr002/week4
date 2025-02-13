package bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankManager bankManager = new BankManager();

        // Adding accounts
        bankManager.addAccount("12345", 5000);
        bankManager.addAccount("67890", 3000);
        bankManager.addAccount("54321", 7000);

        // Depositing money
        bankManager.deposit("12345", 2000);
        System.out.println("Balance of 12345: " + bankManager.getBalance("12345"));

        // Requesting and processing withdrawals
        bankManager.requestWithdrawal("67890");
        boolean success = bankManager.processWithdrawal(1000);
        System.out.println("Withdrawal success: " + success);
        System.out.println("Balance of 67890: " + bankManager.getBalance("67890"));

        // Displaying sorted accounts
        System.out.println("Sorted Accounts: " + bankManager.getSortedAccounts());
    }
}
