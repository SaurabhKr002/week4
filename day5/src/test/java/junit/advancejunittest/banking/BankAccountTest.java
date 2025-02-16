package junit.advancejunittest.banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0); // Initial balance set to 1000
    }

    @Test
    @DisplayName("Test Deposit Functionality")
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), "Balance should be updated correctly after deposit");
    }

    @Test
    @DisplayName("Test Withdraw Functionality")
    void testWithdraw() {
        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance(), "Balance should be updated correctly after withdrawal");
    }

    @Test
    @DisplayName("Test Insufficient Funds Withdrawal")
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(1500.0));
        assertEquals("Insufficient funds", exception.getMessage(), "Should throw error for insufficient funds");
    }

    @Test
    @DisplayName("Test Negative Deposit")
    void testNegativeDeposit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-100.0));
        assertEquals("Deposit amount must be positive", exception.getMessage(), "Should prevent negative deposits");
    }

    @Test
    @DisplayName("Test Negative Withdrawal")
    void testNegativeWithdrawal() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-50.0));
        assertEquals("Withdrawal amount must be positive", exception.getMessage(), "Should prevent negative withdrawals");
    }

    @Test
    @DisplayName("Test Initial Negative Balance")
    void testInitialNegativeBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new BankAccount(-500.0));
        assertEquals("Initial balance cannot be negative", exception.getMessage(), "Should prevent negative initial balance");
    }
}
