import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Email Address: ");
        String email = sc.nextLine();
        sc.close();

        if(isValidEmail(email)) System.out.println("Valid email Address");
        else System.out.println("Invalid Email Address");
    }

    public static boolean isValidEmail(String email) {
        if(email.contains("@") && email.contains(".")) {
            int atIndex = email.indexOf("@");
            int dotIndex = email.indexOf(".");
            if(atIndex < dotIndex && dotIndex < email.length() - 1) return true;
        }
        return false;
    }
}