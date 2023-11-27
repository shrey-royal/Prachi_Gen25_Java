class Food {
    void eat() {
        System.out.println("This food is great");
    }
}

class Pizza extends Food {
    @Override
    void eat() {
        System.out.println("I love Domino's pizza.");
    }
}

class PaniPuri extends Food {
    @Override
    void eat() {
        System.out.println("I love Pani Puri.");
    }
}

public class Casting {
    public static void main(String[] args) {
        Food food;
        
        // food = new Pizza();    //Upcasting
        // food.eat();
        // System.out.println(food instanceof Pizza);
        // System.out.println(food instanceof Food);
        
        // Pizza pizza = (Pizza) food;    //Downcasting
        // pizza.eat();
        // System.out.println(pizza instanceof Pizza);
        // System.out.println(pizza instanceof Food);
        
        
        // food = new PaniPuri();      //Upcasting
        // food.eat();
        // System.out.println(food instanceof PaniPuri);
        // System.out.println(food instanceof Food);
        // PaniPuri paniPuri = (PaniPuri) food;    //Downcasting
        // paniPuri.eat();
        // System.out.println(food instanceof PaniPuri);
        // System.out.println(food instanceof Food);
        
    }
}
/*
Run time Polymorphism: When the method call is resolved at run time, it is called run time polymorphism.
it is also known as Dynamic Method Dispatch.

instanceof OPerator: It is used to check the type of an object at run time. It returns either true or false.

syntax:
    object instanceof class_name

Runtime Polymorphism / Dynamic Binding:

Scenario 1: Vehicle Rental System
In a vehicle rental system, create a base class called "Vehicle" with a method called "rent" that performs the rental process. Implement derived classes like "Car" and "Motorcycle" that override the "rent" method with their specific rental processes.

Scenario 2: Shape Drawing Application
In a shape drawing application, define a base class called "Shape" with a method called "draw" that displays the shape on the screen. Implement derived classes like "Circle" and "Rectangle" that override the "draw" method with their specific drawing logic.

instanceof operator:

Scenario 1: Online Course Platform
In an online course platform, create classes like "Course," "VideoLesson," and "Quiz" representing different course components. Use the instanceof operator to determine the type of course component and perform specific actions or display relevant information.

Scenario 2: Animal Shelter
In an animal shelter application, have classes like "Animal," "Cat," and "Dog" representing different types of animals. Use the instanceof operator to identify the type of animal and apply specific operations like feeding or grooming based on the animal's type.


*/