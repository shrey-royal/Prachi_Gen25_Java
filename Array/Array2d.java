import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print("Enter arr["+i+"]["+j+"] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int[] array : arr) {
            for(int element : array) {
                System.out.print(element + ", ");
            }
            System.out.println();
        }

    }
}
/*
for each loop: It is used to traverse array or collection in java. It is faster than for loop.

for(data_type var : array | collection) {
    // body
}
*/

/*

1. Matrix Addition:
   Write a Java program to perform matrix addition. Allow the user to input two matrices and then add them together to produce the result.

2. Matrix Multiplication:
   Create a program that multiplies two matrices. Prompt the user to input two matrices, and then display the resulting product matrix.

3. Find the Maximum/Minimum Element:
   Given a 2d Array, we have to find max, min elements rowwise as well as columnwise.

4. Transpose a Matrix:
   Write a program to find the transpose of a given matrix. Take a matrix as input and then display its transpose.

5. Diagonal Sum:
   Calculate and display the sum of the diagonal elements (both main diagonal and secondary diagonal) of a square matrix.

6. Search in a Matrix:
   Implement a program that searches for a specific element in a 2D array. Prompt the user for the element to search and then display its position if found.

7. Row and Column Sum:
   Compute the sum of each row and column in a 2D array. Display the sums for all rows and columns.

8. Spiral Matrix:
   Generate a spiral matrix of size N x N. Allow the user to specify the value of N, and then display the resulting spiral matrix.

    Here's what the output of the program might look like when you run it with different values of N. 

    For example, if you enter N = 3:

    ```
    Enter the value of N for the NxN spiral matrix: 3
    1	2	3	
    8	9	4	
    7	6	5
    ```

    And if you enter N = 4:

    ```
    Enter the value of N for the NxN spiral matrix: 4
    1	2	3	4	
    12	13	14	5	
    11	16	15	6	
    10	9	8	7
    ```

    The program generates a spiral matrix for the specified value of N, where N is the size of the matrix. The numbers are filled in a spiral pattern, and the matrix is displayed accordingly.

----

9. Hourglass Sum:
   Given a 6x6 2D array, find and display the maximum hourglass sum. An hourglass sum is the sum of elements in a specific pattern.

10. Rotate a Matrix:
   Implement a program to rotate a given square matrix by 90 degrees in a clockwise direction.

Feel free to use these problem statements as a starting point for your Java programming practice with 2D arrays. You can create the corresponding Java programs to solve these problems and enhance your understanding of working with 2D arrays.
*/


/*
Task:

Problem Statement: Student Record Management System

You are tasked with creating a Student Record Management System using Java. The system should allow users to perform various operations on student records using both 1D and 2D arrays. The program should provide the following menu options:

1. Add a Student Record
   - Prompt the user to enter the student's name, roll number, and marks for multiple subjects. Store this information in a 2D array.

2. View All Student Records
   - Display a list of all student records including their name, roll number, and marks in each subject.

3. View Student Details by Roll Number
   - Prompt the user to enter a roll number, and then display the details (name, roll number, and marks) of the student with that roll number.

4. Calculate Student Average Marks
   - Prompt the user to enter a roll number, and then calculate and display the average marks for the student with that roll number.

5. View Subject-wise Topper
   - Display the student who scored the highest marks in each subject.

6. Exit
   - Terminate the program.

Your program should use a combination of 1D and 2D arrays to store and manage student records. You should implement error handling to ensure that the program does not crash if invalid inputs are provided.

Remember to provide a user-friendly interface with clear instructions and ensure that the program continues running until the user chooses to exit.
*/