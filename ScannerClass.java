import java.util.Scanner; // import the util package to use the scanner class

public class ScannerClass {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);   // create an object of the scanner class

        System.out.println("Enter your name: ");    // ask the user to enter the name
        String name = obj.nextLine();   // get the name from the user

        System.out.println("Enter your age: "); // ask the user to enter the age
        int age = obj.nextInt();    // get the age from the user

        System.out.println("Enter your salary: ");  // ask the user to enter the salary
        double salary = obj.nextDouble();   // get the salary from the user

        System.out.println("Enter your height: ");  // ask the user to enter the height
        float height = obj.nextFloat(); // get the height from the user

        System.out.println("Your name is " + name);    // print the name
        System.out.println("Your age is " + age);  // print the age
        System.out.println("Your salary is " + salary);  // print the salary
        System.out.println("Your height is " + height);  // print the height
    }
}
/*

In java we will use a class called Scanner to get the input from the user.
Now, the scanner class is present in the util package of the java library.
So, we need to import the util package in our program to use the scanner class. (import java.util.Scanner;)

There are multiple sources to scan from in java:
1. System.in - to scan from the keyboard
2. File - to scan from a file
3. String - to scan from a string object
4. Socket - to scan from a socket
5. Stream - to scan from an input stream object

//Steps to use the scanner class:

1. import the util package
2. create an object of the scanner class
3. use the object to call the methods of the scanner class to get the input from the user.
4. close the scanner object (if not this will lead to memory leak)

//Methods of the scanner class:
1. nextByte() - to get the byte input from the user
2. nextShort() - to get the short input from the user
3. nextInt() - to get the int input from the user
4. nextLong() - to get the long input from the user
5. nextFloat() - to get the float input from the user
6. nextDouble() - to get the double input from the user
7. nextBoolean() - to get the boolean input from the user (true/false) (1/0)
8. next() - to get the string input from the user (till the first space)
9. nextLine() - to get the string input from the user (till the first enter)
10. close() - to close the scanner object

Royal Technosoft Pvt. Ltd.

next() -> Royal
nextLine() -> Royal Technosoft Pvt. Ltd.

//Data types in java:
1. Primitive data types (byte, short, int, long, float, double, char, boolean)
2. Non-primitive data types (String, Array, Class, Interface)
*/