class Parent {
    void property() {
        System.out.println("I have a house, a car, and a bike.");
    }
}

class Child extends Parent {
    void property() {
        System.out.println("I have nothing but, My Father have a house, a car, and a bike.");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Child c = new Child();

        c.property();
    }
}


/*
Overriding: When a method with the same name and same parameters but implemented in different classes, then it is known as method overriding.

Overriding rules:
1. Method name must be same.
2. Method parameters must be same.
3. Method return type must be same.
4. Method access modifier must be same or higher.
5. Method must not be static.
6. both classes should inherit from each other.

Tasks:

1. Bank Account Transactions:
Implement a banking application where different account types (savings, checking, investment) have a method to calculate interest. Method overriding can be used to customize the interest calculation based on the account type's interest rate and terms.

2. Employee Payroll System:
Develop a payroll system where different employee types (full-time, part-time, contractor) have a method to calculate pay. Method overriding can be employed to calculate pay differently for each type based on their specific payment structure and hours worked.

*/