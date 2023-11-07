
class Teacher {
    String name;
    String subject[] = new String[2];
    static int count = 0;   //this will count the number of teachers

    Teacher(String name, String subject[]) {
        this.name = name;
        this.subject = subject;
        count++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.print("Subjects: ");
        for (int i = 0; i < subject.length; i++) {
            System.out.print(subject[i] + ", ");
        }
        System.out.println("\b\b \n");
    }
}


public class StaticKW {
    public static void main(String[] args) {
        // Static method can be called without creating an object
        // Static method can only access static variables

        System.out.println("Total Teachers: " + Teacher.count);
        Teacher t1 = new Teacher("Samir Sir", new String[]{"C", "C++"});
        t1.display();
        System.out.println("Total Teachers: " + Teacher.count);
        Teacher t2 = new Teacher("Rahul Sir", new String[]{"Java", "Python"});
        t2.display();
        System.out.println("Total Teachers: " + Teacher.count);
    }
}
/*
Static Keyword gets allocated with the static memory of the class.
> Static Keyword can be used with variables, methods.
> The Memory of any static variable/method is allocated only once in a class, and it is shared by all the objects of that class.

This Keyword is used to refer to the current object.

Task:

Problem Statement: Car Fleet Management

You are tasked with developing a car fleet management system. The system needs to keep track of various pieces of information for each car in the fleet, such as the make, model, year, price, and whether the car is currently in use. Additionally, the system should maintain a count of the total number of cars in the fleet.

Design and implement a `Car` class to represent individual cars in the fleet. The `Car` class should have the following features:

- Attributes:
  - `make` (String): The make or brand of the car.
  - `model` (String): The model of the car.
  - `year` (int): The manufacturing year of the car.
  - `price` (double): The price of the car.
  - `isRunning` (boolean): A flag indicating whether the car is currently running or not.

- Static Attribute:
  - `numberOfCars` (int): A static variable to keep track of the total number of cars in the fleet.

- Methods:
  - A constructor to initialize the car's attributes.
  - `start()` and `stop()` methods to change the `isRunning` status.
  - `displayCarInfo()` method to display car information.
  - A `getNumberOfCars()` static method to retrieve the total number of cars in the fleet.

You need to implement the `Car` class and use it to create, manage, and display information for multiple cars in the fleet. Ensure that the `numberOfCars` variable is properly incremented when new cars are added to the fleet and that it can be accessed without creating an instance of the `Car` class.

*/