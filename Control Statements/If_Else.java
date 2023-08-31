/*
Control Statements are responsible for the flow of execution of the program.

if(condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}

control statements with branching -> if, if-else, if-else-if, switch
control statements with looping -> for, while, do-while

if else Statement:

4 types of if-else statements:

1. if statement -> 
syntax:
    if(condition) {
        // code to be executed if condition is true
    }

2. if-else statement -> 
syntax:
    if(condition) {
        // code to be executed if condition is true
    } else {
        // code to be executed if condition is false
    }

3. else-if ladder -> 
syntax:
    if(condition1) {
        // code to be executed if condition1 is true
    } else if(condition2) {
        // code to be executed if condition2 is true
    } else if(condition3) {
        // code to be executed if condition3 is true
    } else {
        // code to be executed if all conditions are false
    }

4. nested if-else -> 
syntax:
    if(condition1) {
        // code to be executed if condition1 is true
        if(condition2) {
            // code to be executed if condition2 is true
        } else {
            // code to be executed if condition2 is false
        }
    } else {
        // code to be executed if condition1 is false
    }

*/
import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //1. if statement
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        System.out.println("Before the if statement");
        if(a > 5) {
            System.out.println("a is greater than 5");
        }
        System.out.println("After the if statement");
        */
        /*
        //2. if-else statement
        System.out.print("Enter a number: ");
        int b = sc.nextInt();

        System.out.println("Before the if-else statement");
        if(b > 5) {
            System.out.println("b is greater than 5");
        } else {
            System.out.println("b is less than or equal to 5");
        }
        System.out.println("After the if-else statement");
        */
        /*
        //3. else-if ladder
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        if(marks > 90 && marks <= 100) {
            System.out.println(name + ", You've got A");
        } else if(marks > 75 && marks <= 90) {
            System.out.println(name + ", You've got B");
        } else if(marks > 60 && marks <= 75) {
            System.out.println(name + ", You've got C");
        } else if(marks > 45 && marks <= 60) {
            System.out.println(name + ", You've got D");
        } else if(marks > 30 && marks <= 45) {
            System.out.println(name + ", You've got E");
        } else if(marks > 0 && marks <= 30) {
            System.out.println(name + ", You've got F");
        } else {
            System.out.println(name + ", Invalid marks, Stupid!!!");
        }
        */

        //4. nested if-else
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print(name + ", your age? -> ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println(name + ", you can vote");
            if(age >= 60) {
                System.out.println(name + ", you can also apply for pension");
            } else {
                System.out.println(name + ", you can't apply for pension");
            }
        } else {
            System.out.println(name + ", you can't vote");
        }
    }
}

/*
Tasks:

1.  WAP to find out whether given no. is odd or even. ( using IF )
Output:-->
Enter a no.23
Odd

2. WAP to find out whether given no. is positive or negative.
Output :-->
Enter a no.99
positive
Enter a no.-77
Negative

3. WAP to find out maximum. ( using IF .. else if … else if …. Else … )
Output :-->
Enter two no's : 23
43
b is max

4. WAP to find out grade from inputted marks.
Output :
Enter m1,m2,m3 between 1 to 100: 78
65
79
Total is 222
Average is 74.000000
Grade is : A grade

5. WAP to check whether inputted character is either digit or not. Print appropriate message.
Output: 1
Enter any character :- A
Ch is Not Digit
Output: 2
Enter any character :- 1
Ch is Digit




*/