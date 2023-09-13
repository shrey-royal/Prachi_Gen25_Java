public class ContinueBreak {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            if(i==5) {
                // continue;   //skip the rest of the body
                break;          //exit the loop
            }
            System.out.println(i);
        }
    }
}
/*

Continue and break are two keywords that can be used to control the flow of a loop.
> Continue is used to skip the current iteration of a loop and continue with the next iteration.
> Break is used to exit the loop immediately.

Tasks: (break, Continue, Goto statement)

1. Break Statement:
   Write a C program that uses a `while` loop to find and display the sum of all positive integers entered by the user. The program should stop when the user enters a negative number using the `break` statement.

2. Continue Statement:
   Create a C program that prints all even numbers between 1 and 100, but skips the numbers that are divisible by 5 using the `continue` statement.

3. Goto Statement:
   Write a C program to implement a simple menu-driven calculator. Use the `goto` statement to allow the user to return to the main menu after performing a calculation.

4. Break and Continue Statement:
   Implement a C program that takes an array of integers and finds the first occurrence of a negative number using the `break` statement. If a negative number is found, continue searching for positive numbers and display their sum using the `continue` statement.

5. Goto and Break Statement:
   Create a C program that simulates a basic ATM machine. Use the `goto` statement to implement different menu options (e.g., balance inquiry, withdrawal) and allow the user to exit the ATM menu using the `break` statement.

6. Continue Statement in Nested Loops:
   Write a C program that uses nested loops to find and print all prime numbers between 1 and 100. Use the `continue` statement to skip non-prime numbers in the inner loop.

7. Break Statement in Nested Loops:
   Implement a C program that searches for a specific element in a two-dimensional array. Use nested loops to iterate through the array, and when the element is found, exit both loops using the `break` statement.

8. Goto Statement for Error Handling:
   Design a C program that reads a file and performs some operations on its contents. Use the `goto` statement for error handling, such as jumping to a label when a file operation fails.

9. Continue Statement in a Loop:
   Create a C program that reads a sequence of numbers from the user until a zero is entered. Calculate and display the average of the positive numbers using the `continue` statement to skip zeros.

10. Break and Goto Statement:
   Write a C program that plays a simple number guessing game with the user. Use the `goto` statement to allow the user to restart the game after guessing the correct number, and use the `break` statement to exit the game when desired.

*/