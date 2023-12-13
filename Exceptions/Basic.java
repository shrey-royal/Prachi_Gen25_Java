import java.util.Scanner;

public class Basic {

    public static void div(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Infinite / Undefined Value");
        } else {
            System.out.println(a/b);
        }
    }

    public static void division(int a, int b) throws ArithmeticException {
        System.out.println(a/b);
    }


    public static void main(String[] args) {
        System.out.println("Before Exception");
        Scanner sc = new Scanner(System.in);

        try {
            // sc.nextFloat();
            // System.out.println(12/0);
            // Basic.division(12, 10);
        } catch(Exception e) {
            // System.out.println(e);
            e.printStackTrace();
        } /*catch(InputMismatchException e) {
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        } */finally {
            System.out.println("Finally Block Executed.");
            sc.close();
        }
        
        System.out.println("After Exception");

    }
}
