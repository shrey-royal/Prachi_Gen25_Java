import java.util.Random;
import java.util.Scanner;

public class Array1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // int[] arr = {1, 2, 3, 4, 5};
        
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int []arr = new int[size];

        for(int i=0; i<arr.length; i++) {
            // arr[i] = i+1;
            arr[i] = rand.nextInt(100);
        }

        System.out.print("Array elements are: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        System.out.print("Enter the element to search: ");
        int search = sc.nextInt();

        int index = -1; // -1 means not found
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == search) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println(search + " not found");
        } else {
            System.out.println(search + " found at index: " + index);
        }


        // for(int i=0; i<arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // for(int i=arr.length-1; i>=0; i--) {
        //     System.out.println(arr[i]);
        // }
    }
}

/*

1. Sum of Array Elements: Write a Java program to calculate the sum of all elements in an integer array.

2. Find Maximum and Minimum: Create a Java program that finds the maximum and minimum values in an integer array.

3. Search for an Element: Write a Java function to search for a specific element in an integer array and return its index. If the element is not found, return -1.

4. Reverse an Array: Implement a Java function that reverses the elements of an integer array in-place.

5. Array Average: Develop a Java program that calculates the average of all elements in a floating-point number array.

6. Write a Java program to find the smallest and second smallest elements of a given array.  
Test case:

Input: {5, 2, 8, 1, 9, 4}
Output:
```
Smallest: 1
Second Smallest: 2
```

7. Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides.
Test case:

Input: {0, 1, 0, 1, 1, 0}
Output: {0, 0, 0, 1, 1, 1}

8. Write a Java program to arrange the elements of an array of integers so that all negative integers appear before all positive integers.  
Test case:

Input: {-5, 2, -8, 1, 9, -4}
Output: {-5, -8, -4, 2, 1, 9}

9. Write a Java program to arrange the elements of an array of integers so that all positive integers appear before all negative integers.
Test case:

Input: {-5, 2, -8, 1, 9, -4}
Output: {2, 1, 9, -5, -8, -4}

*/