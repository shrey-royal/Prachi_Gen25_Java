class Parent {
    Parent get() {
        System.out.println("This is parent class");
        return this;    //return current object
    }

    void message() {
        System.out.println("message from parent class");
    }
}

class Child extends Parent {
    @Override
    Child get() {
        System.out.println("This is child class");
        return this;
    }

    void message() {
        System.out.println("message from child class");
    }
}

public class CovariantRT {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.get().message();

        Child c = new Child();
        c.get().message();
    }
}

/*
Covariant Return type specifies that the return type may vary in the same direction as the subclass.

Primitive Data Types are not covariant. (int, float, double, etc.)
Non-Primitive Data Types are covariant. (String, Array, class, etc.)


Adavntages of Covariant Return Type:

1. Covariant Return Type assits to stay away from the confusing type casts in the class hierarchy and makes the code more usable.
2. In the method overriding, the covaraint return type provides the liberty to have more to the point return types.
3. covariant rt helps in preventing the runtime ClassCastExceptions on returns.

Tasks:

Scenario 1: Animal Sounds
In an animal sounds application, create a base class called "Animal" with a method called "makeSound" that returns an instance of the "Sound" class. Implement derived classes like "Dog" and "Cat" that override the "makeSound" method and return their specific sound objects.

Scenario 2: Shape Factory
In a shape factory application, define an abstract base class called "Shape" with a method called "createShape" that returns an instance of the "Shape" class. Implement derived classes like "Circle" and "Rectangle" that override the "createShape" method and return their specific shape objects.


Scenario 3: E-commerce Product Search
In an e-commerce product search application, create a base class called "Product" with a method called "search" that returns an instance of the "Product" class. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "search" method and return their specific product objects.

Scenario 4: Stock Market Analysis
In a stock market analysis system, define a base class called "Stock" with a method called "getStockData" that returns an instance of the "Stock" class. Implement derived classes like "TechStock" and "PharmaStock" that override the "getStockData" method and return their specific stock data objects.

*/