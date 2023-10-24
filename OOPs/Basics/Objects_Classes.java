import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;

    public void scanStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the roll number: ");
        rollNo = sc.nextInt();

        sc.nextLine();  // to clear the buffer
        System.out.print("Enter the name: ");
        name = sc.nextLine();

        sc.close();
    }

    public void printStudentDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class Objects_Classes {
    private int a;
    int b;

    public void scanVars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        sc.close();
    }

    public void printVars() {
        System.out.println("a = " + a + "\nb = " + b);
    }


    public static void main(String[] args) {
        // Objects_Classes obj = new Objects_Classes();

        // obj.scanVars();
        // obj.printVars();

        // System.out.println("b = " + obj.b);

        Student st = new Student();

        st.scanStudentDetails();
        st.printStudentDetails();
    }
}

/*
Q. What is an Object?
A. An Object is the physical as well as logical entity.

Ex: chair, pen, table, keyboard, bike, etc.

Q. What is a Class?
A. A Class is a group of similar objects. It is a logical entity.

Ex: if you have a chair, pen, table, whiteboard, blackboard, chalk, markers, etc. then you can say that you have a "Furniture" in the class.


How to create an Object?
    ClassName objectName = new ClassName();



*/