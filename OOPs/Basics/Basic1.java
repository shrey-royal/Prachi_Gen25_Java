import java.util.Scanner;

class Employee {
    //attributes
    int id;
    String name;
    int age;
    double salary;
    String department;

    //methods: scan, print
    public void scanDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = sc.nextInt();

        sc.nextLine();  // to clear the buffer
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        sc.nextLine();  // to clear the buffer
        System.out.print("Enter department: ");
        department = sc.nextLine();
    }

    public void printDetails() {
        System.out.println(id + "\t" + name + "\t" + age + "\t" + salary + "\t" + department);
    }
}

public class Basic1 {
    public static void main(String[] args) {
        Employee e1, e2;//, e3, e4, e5;

        e1 = new Employee();
        e2 = new Employee();
        // e3 = new Employee();
        // e4 = new Employee();
        // e5 = new Employee();

        // Employee e3 = new Employee();
        // Employee e4 = new Employee();
        // Employee e5 = new Employee();
    
        e1.scanDetails();
        e2.scanDetails();
        // e3.scanDetails();
        // e4.scanDetails();
        // e5.scanDetails();

        System.out.println("ID\tName\tAge\tSalary\tDepartment");
        e1.printDetails();
        e2.printDetails();
        // e3.printDetails();
        // e4.printDetails();
        // e5.printDetails();

    }
}

/*
Employee class:
attributes: id, name, age, salary, department
scan at least 5 employees
*/