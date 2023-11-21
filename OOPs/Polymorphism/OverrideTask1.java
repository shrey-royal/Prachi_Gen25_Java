/*
1. Bank Account Transactions:
Implement a banking application where different account types (savings, checking, investment) have a method to calculate interest. Method overriding can be used to customize the interest calculation based on the account type's interest rate and terms.
*/

class Account {
    String name;
    double balance;
    double interestRate;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }

    void calculateInterest() {
        System.out.println("Interest: " + (balance * interestRate));
    }

    void getInterestRate() {
        System.out.println("Interest Rate: " + interestRate);
    }
};

class SavingsAccount extends Account {

    SavingsAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.interestRate = 0.05;   //5%
    }

    @Override
    void calculateInterest() {
        System.out.println("Interest: " + (balance * interestRate));
    }
};

class CheckingAccount extends Account {

    CheckingAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.interestRate = 0.01;   //1%
    }

    @Override
    void calculateInterest() {
        System.out.println("Interest: " + (balance * interestRate));
    }
};

class InvestmentAccount extends Account {

    InvestmentAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.interestRate = 0.1;   //10%
    }

    @Override
    void calculateInterest() {
        System.out.println("Interest: " + (balance * interestRate));
    }
};

public class OverrideTask1 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Savings Account", 10000);
        CheckingAccount ca = new CheckingAccount("Checking Account", 10000);
        InvestmentAccount ia = new InvestmentAccount("Investment Account", 10000);

        sa.display();
        sa.calculateInterest();
        System.out.println();

        ca.display();
        ca.calculateInterest();
        System.out.println();

        ia.display();
        ia.calculateInterest();
        System.out.println();
    }    
}