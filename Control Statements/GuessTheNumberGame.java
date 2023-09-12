import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1;   // 1 to 100

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        
        int guess;
        do {
            System.out.println("Type a number: ");
            guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("Too low. Try again.");
            } else if (guess > number) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("You guessed it!");
            }
        } while (number != guess);
        scanner.close();
    }
}
