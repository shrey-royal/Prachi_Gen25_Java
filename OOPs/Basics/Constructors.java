class Person {
    String name;
    int age;

    // Default Constructor
    Person() {  //automatically called when object is created
        name = null;
        age = 0;
        System.out.println("Default Constructor called");
    }

    // Parameterized Constructor
    Person(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor called");
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Person p1 = new Person("John", 20);
        // System.out.println(p1.name);
        // System.out.println(p1.age);

        Person p[] = new Person[3];
        p[0] = new Person();
        p[1] = new Person("Vishwa", 21);
        p[2] = new Person("Sonu", 22);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].name + " " + p[i].age);
        }
    }
}

/*
Constructors are used to initialize the instance variables.

> Constructors are automatically called when object is created.
> Constructors are a special type of methods that have same name as class name and automatically called when object is created.

2 types of constructors:
    1. Default Constructor (No parameters)
    2. Parameterized Constructor (With parameters)


Task:

Employee Payroll System: Build a Java program to calculate the monthly salary of employees using an Employee class. Create a default constructor to set basic employee details and a parameterized constructor to input hourly wage and hours worked for hourly employees, or a monthly salary for salaried employees.

Employee class

attributes:
    int employeeId;
    String employeeName;
    String employeeType; // "Hourly" or "Salaried"
    double hourlyWage;
    double hoursWorked;
    double monthlySalary;


*/