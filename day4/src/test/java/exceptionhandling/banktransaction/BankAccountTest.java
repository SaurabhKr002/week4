package exceptionhandling.banktransaction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testValidWithdrawal() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(1000.0);
        account.withdraw(500.0);
        assertEquals(500.0, account.getBalance(), "Balance should be updated correctly.");
    }

    @Test
    void testInsufficientBalance() {
        BankAccount account = new BankAccount(500.0);
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> {
            account.withdraw(600.0); // More than balance
        });
        assertEquals("Insufficient balance!", exception.getMessage());
    }

    @Test
    void testNegativeAmount() {
        BankAccount account = new BankAccount(1000.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100.0); // Negative value
        });
        assertEquals("Invalid amount!", exception.getMessage());
    }
}
