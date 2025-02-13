package bankingsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Map;

class BankManagerTest {
    @Test
    void testAccountCreation() {
        BankManager bankManager = new BankManager();
        bankManager.addAccount("12345", 5000);

        assertEquals(5000, bankManager.getBalance("12345"), "Initial balance is incorrect.");
    }

    @Test
    void testDeposit() {
        BankManager bankManager = new BankManager();
        bankManager.addAccount("12345", 5000);
        bankManager.deposit("12345", 2000);

        assertEquals(7000, bankManager.getBalance("12345"), "Deposit function is incorrect.");
    }

    @Test
    void testWithdrawalProcessing() {
        BankManager bankManager = new BankManager();
        bankManager.addAccount("67890", 3000);
        bankManager.requestWithdrawal("67890");

        boolean success = bankManager.processWithdrawal(1000);
        assertTrue(success, "Withdrawal should be successful.");
        assertEquals(2000, bankManager.getBalance("67890"), "Balance after withdrawal is incorrect.");
    }

    @Test
    void testSortedAccounts() {
        BankManager bankManager = new BankManager();
        bankManager.addAccount("12345", 5000);
        bankManager.addAccount("67890", 3000);
        bankManager.addAccount("54321", 7000);

        Map<Double, String> sorted = bankManager.getSortedAccounts();
        assertEquals("67890", sorted.get(3000.0), "Sorting accounts by balance is incorrect.");
    }
}
