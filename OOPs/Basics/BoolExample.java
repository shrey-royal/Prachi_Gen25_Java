import java.util.Scanner;

public class BoolExample {
    public static void main(String[] args) {
        boolean b;  //true or false
        
        b = true;
        System.out.println("b is " + b);

        b = false;
        System.out.println("b is " + b);

        Scanner sc = new Scanner(System.in);
        System.out.print("b -> ");
        b = sc.nextBoolean();
        System.out.println("b is " + b);
        sc.close();

    }
}
