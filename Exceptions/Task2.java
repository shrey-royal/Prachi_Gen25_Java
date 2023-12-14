import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the temp: ");
            float temp = convertTemperature(sc.nextFloat(), true);
            System.out.println(temp);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }

    static float convertTemperature(float value, boolean i) {
        // i = true -> farenheit to celsius
        // i = false -> celsius to farenheit

        if(i) {
            // c = (f-32)x5/9
            System.out.println("Converting farenheit to celsius");
            return (value-32)*5/9;
        } else {
            // f = c x 9/5 + 32
            System.out.println("Converting celsius to farenheit");
            return value * 9/5 + 32;
        }
    }
}