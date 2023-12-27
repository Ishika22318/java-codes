import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int count = 0; 

        System.out.println("--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = sc.nextInt();
            count++;

            if (guess < randomNumber) {
                System.out.println("HIGHER.");
            } else if (guess > randomNumber) {
                System.out.println("LOWER.");
            } else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
                System.out.println("You got it in "+ count + " guesses!");
            }

        } while (guess != randomNumber);
    }
}
