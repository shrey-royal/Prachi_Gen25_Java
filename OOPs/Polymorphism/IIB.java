class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class IceCream extends Parent {
    int price;
    String name;

    {
        System.out.println("IIB called");
        price = 10;
        name = "Vanilla";
    }

    IceCream() {
        System.out.println("Constructor called");
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

}

public class IIB {
    public static void main(String[] args) {
        IceCream i = new IceCream();
    }
}
/*
Instance Initializer Block: It is used to initialize the instance data member. It run each time when object of the class is created.

Q. Why use IIB and not constructor?
> IIB can be used to initialize the instance variables of the class where as constructor can be used to initialize the static and final variables.


syntax:
{
    //code to be executed
}


Constructor:

ClassName() {
    super();    //default compiler generated call to super class constructor
    IIB();      //default compiler generated call to IIB


    //code to be executed
}

Tasks:

Scenario 1: Employee Database
In an employee database system, create a class called "Employee" with an instance initializer block that initializes a static database connection. The block runs whenever an object of the "Employee" class is created.

Scenario 2: Game Initialization
In a game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

Scenario 3: Online Game Initialization
In an online game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

Scenario 4: Company Employee Management
In a company employee management system, create a class called "Employee" with an instance initializer block that initializes an employee's access privileges and permissions when a new employee object is created.


*/