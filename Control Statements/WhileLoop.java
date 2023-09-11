public class WhileLoop {
    public static void main(String[] args) {
        // int i = 0;  //initialization
        // while (i < 10) {    //condition
        //     System.out.println("i is " + i);    //body
        //     i++;    //inc/dec
        // }

        int num = 12345, revNum = 0;
        while(num > 0) {
            int rem = num % 10; //last digit
            // System.out.print(rem);  //print last digit
            revNum = revNum * 10 + rem; //add last digit to revNum
            num = num / 10; //remove last digit
        }
        System.out.println(revNum);
    }
}

/*

while loop is used when the number of iterations are not fixed.

syntax:

initialization;
while (condition) {
    // body
    // inc/dec
}


reverse number:
Input: 12345
Output: 54321


Tasks:

1. Counting 1 to N
2. Sum of N Numbers
3. Factorial of a number
4. Reverse a number
5. Palindrome number

*/