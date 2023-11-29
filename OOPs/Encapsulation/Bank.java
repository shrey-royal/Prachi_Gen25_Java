import myPackage.BankAccount;
import myPackage.Transaction;
// import myPackage.*;

public class Bank {
    public static void main(String[] args) {
        BankAccount father = new BankAccount("1234567890", "Father", 100000);
        BankAccount son = new BankAccount("0987654321", "Son", 1000);

        System.out.println("Initial Balance:");
        System.out.println(father.getAccountHolder() + ": " + father.getBalance());
        System.out.println(son.getAccountHolder() + ": " + son.getBalance());

        Transaction t = new Transaction();
        t.transfer(father, son, 50000);

        System.out.println("Final Balance:");
        System.out.println(father.getAccountHolder() + ": " + father.getBalance());
        System.out.println(son.getAccountHolder() + ": " + son.getBalance());
    }
}
