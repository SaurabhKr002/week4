package bankingsystem;

import java.util.*;

class BankManager {
    private Map<String, Account> accounts = new HashMap<>();
    private TreeMap<Double, String> sortedAccounts = new TreeMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    // Adds a new account
    public void addAccount(String accountNumber, double balance) {
        Account account = new Account(accountNumber, balance);
        accounts.put(accountNumber, account);
        sortedAccounts.put(balance, accountNumber);
    }

    // Deposits money into an account
    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            sortedAccounts.remove(account.getBalance());
            account.deposit(amount);
            sortedAccounts.put(account.getBalance(), accountNumber);
        }
    }

    // Requests a withdrawal by adding it to the queue
    public void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        }
    }

    // Processes the next withdrawal request in the queue
    public boolean processWithdrawal(double amount) {
        if (withdrawalQueue.isEmpty()) {
            return false;
        }
        String accountNumber = withdrawalQueue.poll();
        Account account = accounts.get(accountNumber);
        if (account.withdraw(amount)) {
            sortedAccounts.remove(account.getBalance() + amount);
            sortedAccounts.put(account.getBalance(), accountNumber);
            return true;
        }
        return false;
    }

    // Gets account balance
    public double getBalance(String accountNumber) {
        return accounts.get(accountNumber).getBalance();
    }

    // Gets all accounts sorted by balance
    public Map<Double, String> getSortedAccounts() {
        return new TreeMap<>(sortedAccounts);
    }
}
