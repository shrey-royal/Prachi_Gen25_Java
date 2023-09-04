import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Number: ");
        int number = sc.nextInt();

        boolean result = (number % 2 == 0) ? true : false;
        // System.out.println("Number is Even: " + result);
        System.out.println("Number is " + (result ? "Even" : "Odd"));
    }
}
