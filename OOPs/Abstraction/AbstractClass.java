abstract class Kitchen {
    abstract void pizza();
    abstract void pasta();
    abstract void burger();
    public void order() {
        System.out.println("Order placed successfully.");
    }
}

class Dominos extends Kitchen {
    @Override
    void pizza() {
        System.out.println("Dominos pizza is ordered.");
    }
    @Override
    void pasta() {
        System.out.println("Dominos pasta is ordered.");
    }
    @Override
    void burger() {
        System.out.println("Dominos burger is ordered.");
    }
}

class PizzaHut extends Kitchen {
    @Override
    void pizza() {
        System.out.println("Pizza Hut pizza is ordered.");
    }
    @Override
    void pasta() {
        System.out.println("Pizza Hut pasta is ordered.");
    }
    @Override
    void burger() {
        System.out.println("Pizza Hut burger is ordered.");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Kitchen kitchen;

        kitchen = new Dominos();
        kitchen.pizza();
        kitchen.pasta();
        kitchen.burger();
        kitchen.order();

        kitchen = new PizzaHut();
        kitchen.pizza();
        kitchen.pasta();
        kitchen.burger();
        kitchen.order();
    }
}

/*
Task: Any 2 scenarios from the following list of scenarios using

Abstract Class:

Scenario 1: Animal Hierarchy
Create an abstract class called "Animal" with abstract methods like "eat" and "sound." Implement derived classes like "Cat" and "Dog" that provide specific implementations for these abstract methods.

Scenario 2: Vehicle Manufacturing
Design an abstract class called "Vehicle" with abstract methods like "assemble" and "paint." Implement derived classes like "Car" and "Motorcycle" that provide specific implementations for these abstract methods.

Scenario 3: Banking System
Develop an abstract class called "Account" with abstract methods like "deposit" and "withdraw." Implement derived classes like "SavingsAccount" and "CurrentAccount" that provide specific implementations for these abstract methods.

Scenario 4: Shape Calculation
Create an abstract class called "Shape" with abstract methods like "calculateArea" and "calculatePerimeter." Implement derived classes like "Circle" and "Rectangle" that provide specific implementations for these abstract methods.

Scenario 5: Employee Management
Design an abstract class called "Employee" with abstract methods like "calculateSalary" and "displayDetails." Implement derived classes like "Manager" and "Engineer" that provide specific implementations for these abstract methods.

Scenario 6: Music Player Application
Develop an abstract class called "MediaPlayer" with abstract methods like "play" and "stop." Implement derived classes like "AudioPlayer" and "VideoPlayer" that provide specific implementations for these abstract methods.

Scenario 7: University Management System
Create an abstract class called "Person" with abstract methods like "registerCourse" and "submitAssignment." Implement derived classes like "Student" and "Professor" that provide specific implementations for these abstract methods.

Scenario 8: Mobile Application Development
Design an abstract class called "App" with abstract methods like "open" and "close." Implement derived classes like "ChatApp" and "PhotoEditingApp" that provide specific implementations for these abstract methods.

Scenario 9: Shopping Cart System
Develop an abstract class called "CartItem" with abstract methods like "calculatePrice" and "displayDetails." Implement derived classes like "ElectronicsItem" and "ClothingItem" that provide specific implementations for these abstract methods.

Scenario 10: Recipe Management Application
Create an abstract class called "Recipe" with abstract methods like "prepareIngredients" and "cook." Implement derived classes like "SoupRecipe" and "DessertRecipe" that provide specific implementations for these abstract methods.


*/