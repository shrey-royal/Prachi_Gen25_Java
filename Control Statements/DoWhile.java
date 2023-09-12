import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int i=0;
        do {
            System.out.println("i is " + i);
            i++;
        } while(i<num);
    }
}
/*
do while loop: the body is executed at least once, and then the condition is checked.

syntax:

initialization;
do {
    // body
    // inc/dec
} while (condition);


Tasks:

1. Sum of Numbers: Write a program that calculates the sum of all integers from 1 to N, where N is entered by the user.

2. Guess the Number: Create a number guessing game where the computer generates a random number between 1 and 100, and the user has to guess it. Use a 'do-while' loop to repeatedly prompt the user for guesses until they guess correctly.

3. Factorial Calculation: Write a program to calculate the factorial of a given number (N). Use a 'do-while' loop to perform the calculation.

4. Multiplication Table: Display the multiplication table for a given number (N) using a 'do-while' loop. The table should go from 1 to 10.

5. Countdown: Write a program that counts down from a specified number (N) to 1 using a 'do-while' loop.

6. Password Validation: Implement a simple login system where the user has to enter a password. Use a 'do-while' loop to repeatedly prompt the user for the password until it matches a predefined password.

7. Average Calculator: Create a program that calculates the average of a set of numbers entered by the user. The user should be able to enter as many numbers as they want, and the loop continues until they decide to stop.

8. Menu Driven Program: Build a menu-driven program that allows the user to choose from a set of options (e.g., add, subtract, multiply, divide). Use a 'do-while' loop to keep the menu displayed until the user chooses to exit.

9. Fibonacci Series: Generate and print the first N terms of the Fibonacci series using a 'do-while' loop.

10. Even or Odd Sum: Write a program that calculates the sum of all even or odd numbers between 1 and N, where the user can choose to sum even or odd numbers using a 'do-while' loop.


*/