package myPackage;
import myPackage.BankAccount;

public class Transaction {
    public void transfer(BankAccount sender, BankAccount receiver, double amount) {
        if(sender.getBalance() >= amount) {
            sender.withdraw(amount);
            receiver.desposit(amount);
            System.out.println("Transfer of " + amount + " from " + sender.getAccountHolder() + " to " + receiver.getAccountHolder() + " Successful.");
        } else {
            System.out.println("Transfer Failed. Insufficient funds in the sender's account.");
        }
    }
}
