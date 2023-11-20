/*
class Animal {
    private String name, color;
    
    Animal() {
        // name = color = null;
        name = "Animal";
        color = "white";
    }

    Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("I have a " + name + " and it is " + color + " in color.");
    }
}


public class Method_Overloading {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal("Luna", "Grey");

        dog.display();
        cat.display();
    }
}


*/

import java.util.Scanner;

class Calculator {
    Scanner sc = new Scanner(System.in);
    void add() {
        System.out.print("Enter a & b: ");
        System.out.println("Addition => " + sc.nextInt() + sc.nextInt());
    }

    void add(int a, int b) {
        System.out.println("Addition => " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Addition => " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Addition => " + (a + b));
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add();
        c.add(10, 20);
        c.add(10, 20, 30);
        c.add(10.5, 20.5);
    }
}

/*
Overloading: When a class has multiple methods with the same name but different parameters, then it is known as method overloading.

Method Overloading is done using 2 ways:
1. By changing the number of arguments
2. By changing the data type of arguments


Tasks:

1. Calculator Application:
Create a calculator application with overloaded methods for basic arithmetic operations (addition, subtraction, multiplication, division) to handle different data types (integers, floats, doubles).

2. Measurement Conversion Tool:
Design a tool that converts measurements (e.g., length, weight, volume) between various units (e.g., meters to feet, kilograms to pounds). Method overloading can help implement conversion methods for different units within each measurement type.

*/