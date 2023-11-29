package myPackage;

public class BankAccount {
    private String accountNo;
    private String accountHolder;
    private int balance;

    public BankAccount(String accountNo, String accountHolder, int balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public int getBalance() {
        return this.balance;
    }

    public void desposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " Successful. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if(balance >= amount && (balance-amount) > 2000) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " Successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance. Withdrawal of " + amount + " Unsuccessful.");
        }
    }

}
