import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        float a = sc.nextInt();

        System.out.println("Enter b: ");
        float b = sc.nextInt();

        //clear the console
        // System.out.print("\033[H\033[2J");

        System.out.println("\nList of operations: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter the operation you want to perform: ");
        int operation = sc.nextInt();

        switch(operation) {
            case 1:
                System.out.println("You've selected Addition.");
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case 2:
                System.out.println("You've selected Subtraction.");
                System.out.println(b + " - " + a + " = " + (b - a));
                break;

            case 3:
                System.out.println("You've selected Multiplication.");
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case 4:
                System.out.println("You've selected Division.");
                System.out.println(a + " / " + b + " = " + (a / b));
                break;

            default:
                System.out.println("Invalid operation.");
        }
    }
}
/*
Switch Case:

> It is a type control statement in which user will control the flow of the program.
> Here user will choose what to execute and what not to execute.
> we will have multiple cases and one default case.

syntax:

switch(expression) {
    case 'a':
        // code block
        break;

    case 2:
        // code block
        break;
    .
    .
    .
    .

    case n:
        // code block
        break;

    default:    // if none of the cases matches with the user's input(expression) then default case will be executed.
        // code block
}

> here we are matching the value of expression with the value of case.
> the break statement is used to break out of the switch statement once a case is matched.
*/

/*
Tasks:

1. Grade Calculator: Write a program that takes a student's score as input and uses a `switch` statement to determine their letter grade (A, B, C, D, or F).

2. Day of the Week: Create a program that takes an integer (1-7) as input and uses a `switch` statement to print the corresponding day of the week.

3. Calculator: Build a simple calculator that takes two numbers and an operator (+, -, *, /) as input and performs the corresponding arithmetic operation using a `switch` statement.

4. Month Name: Write a program that takes an integer (1-12) as input and uses a `switch` statement to display the corresponding month name.

5. Season Identifier: Create a program that takes a month as input and uses a `switch` statement to identify and print the season (e.g., spring, summer, fall, winter).

6. Menu Selection: Implement a basic restaurant menu with items and prices. Ask the user to select an item using a number, and then use a `switch` statement to display the selected item and its price.

7. Traffic Light Simulator: Simulate a traffic light with three states (red, yellow, green). Use a `switch` statement to change the light's state based on user input.

8. Shape Area Calculator: Write a program that calculates the area of different shapes (circle, square, rectangle) based on user input using a `switch` statement.

9. Temperature Converter: Build a temperature converter that allows the user to convert between Celsius and Fahrenheit using a `switch` statement to select the conversion type.
*/