public class For_loop {
    public static void main(String[] args) {
        // for(int i=0; i<5; i++) {
        //     if(i == 2) {
        //         // break;
        //         continue;
        //     }
        //     System.out.println("i = " + i);
        // }

        
        // for(int i=0; ; i++) {   // infinite loop
        //     System.out.println(i);
        // }

        // for(;;) { }   // infinite loop        
    }
}

/*
For loop: A for loop is a control structure that allows us to repeat certain operations by incrementing and evaluating a loop counter.

Syntax:
for (initialization; condition; increment/decrement) {
    // code to be executed
}

> entry controlled loop

> initialization: initializes the iterator variable
> condition: evaluated each time the loop iterates. The loop executes the statement repeatedly, until this condition returns false.
> increment/decrement: increases or decreases the value of the iterator variable
> statement: the code to be executed each iteration
> break: terminates the loop
> continue: skips the current iteration of a loop
> nested for loop: a loop inside another loop
> infinite loop: a loop that never ends. The condition of the loop is always true.
> iteration: each repetition of the loop (when the body of the loop is executed once it is called an iteration)


Tasks:

1. print 1 to n
2. print n to -10
3. scan n then print n+i(i = iterator_variable)
4. scan n then print multiplication of n.
5. scan n then print reverse multiplication of n.
6. scan a and b then print numbers between a & b.

Here are 15 problem statements that can be solved using a single `for` loop in Java:

1. Write a Java program to calculate the sum of the first N natural numbers.
2. Create a Java program to find the factorial of a given positive integer.
3. Develop a Java program to generate the Fibonacci series up to a specified number of terms.
4. Write a Java program to determine whether a given number is a palindrome.
5. Implement a Java program to calculate the sum of digits of a given integer.
6. Create a Java program to calculate the sum of all prime numbers between 1 and N.
8. Develop a Java program to find the product of digits of a given integer.
9. Write a Java program to calculate the sum of all even digits in a given integer.
10. Implement a Java program to reverse a given number.
11. Create a Java program to check if a given number is a perfect number or not.
12. Write a Java program to find the GCD (greatest common divisor) of two numbers.
13. Develop a Java program to print the prime factors of a given number.
14. Write a Java program to calculate the factorial of each number in a given range and display the results.
15. Implement a Java program to check if a given number is an Armstrong number.

Expected Output:

1. Calculate the sum of the first N natural numbers:
   Input N: 5
   Expected Output: 15

2. Find the factorial of a given positive integer:
   Input N: 4
   Expected Output: 24

3. Generate the Fibonacci series up to a specified number of terms:
   Input Terms: 7
   Expected Output: 0 1 1 2 3 5 8

4. Determine whether a given number is a palindrome:
   Input Number: 121
   Expected Output: Palindrome

5. Calculate the sum of digits of a given integer:
   Input Number: 12345
   Expected Output: 15

6. Calculate the sum of all prime numbers between 1 and N:
   Input N: 20
   Expected Output: 77

7. Generate a pattern of numbers:
   Input Rows: 4
   Expected Output:
   1
   12
   123
   1234

8. Find the product of digits of a given integer:
   Input Number: 456
   Expected Output: 120

9. Calculate the sum of all even digits in a given integer:
   Input Number: 824169
   Expected Output: 10

10. Reverse a given number:
    Input Number: 12345
    Expected Output: 54321

11. Check if a given number is a perfect number or not:
    Input Number: 28
    Expected Output: Perfect Number

12. Find the GCD of two numbers:
    Input Numbers: 24, 36
    Expected Output: 12

13. Print the prime factors of a given number:
    Input Number: 56
    Expected Output: 2 7

14. Calculate the factorial of each number in a given range:
    Input Range: 1 to 5
    Expected Output: 1 2 6 24 120

15. Check if a given number is an Armstrong number:
    Input Number: 153
    Expected Output: Armstrong Number

*Palindrome Number:*
A palindrome number is a number that remains the same when its digits are reversed. In other words, if you read the number from left to right and from right to left, it will be the same. For example, 121 and 1331 are palindrome numbers.

*Example:*
- Input: 121
- Output: Palindrome

*Test Cases:*
1. Input: 12321
   Output: Palindrome
2. Input: 45654
   Output: Palindrome
3. Input: 12345
   Output: Not Palindrome

*Fibonacci Series:*
The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. The sequence goes 0, 1, 1, 2, 3, 5, 8, 13, and so on.

*Example:*
- Input: 6
- Output: 8 (0, 1, 1, 2, 3, 5, 8)

*Test Cases:*
1. Input: 0
   Output: 0
2. Input: 1
   Output: 1
3. Input: 10
   Output: 34

*Armstrong Number:*
An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits raised to the power of the number of digits. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.

*Example:*
- Input: 153
- Output: Armstrong

*Test Cases:*
1. Input: 370
   Output: Armstrong
2. Input: 371
   Output: Armstrong
3. Input: 123
   Output: Not Armstrong


A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself. In other words, a prime number is only divisible by 1 and itself. For example, 2, 3, 5, 7, 11, and 13 are prime numbers.

*/