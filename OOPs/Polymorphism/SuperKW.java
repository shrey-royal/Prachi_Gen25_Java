class Animal {
    String color = "White";

    Animal() {
        System.out.println("Animal is created");
    }

    void eat() {
        System.out.print("Eating ");
    }
}

class Dog extends Animal {
    String color = "Black";

    Dog() {
        super();    //calls parent class' constructor (super() should be the first statement in constructor)
        System.out.println("Dog is created");
    }

    void printColor() {
        System.out.println(color);  //prints color of Dog class
        System.out.println(super.color);  //prints color of Animal class
    }

    void eat() {
        super.eat();
        System.out.println("bread...");
    }
}

public class SuperKW {
    public static void main(String[] args) {
        Dog d = new Dog();
        // d.printColor();
        d.eat();
    }
}

/*
Super Keyword: used to refer parent class' variable, methods and constructors.
    1. super.variable - to call the parent class' variable
    2. super.method() - to call the parent class' method
    3. super() - to call the parent class' constructor

Tasks:

Scenario 1: Vehicle Manufacturing
In a vehicle manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

Scenario 2: Online Retail System
In an online retail system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "displayDetails" method and use the super keyword to display both general and specific product details.


*/