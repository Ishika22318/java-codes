import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise9 {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 to 5");
        int guessNumber1 = sc.nextInt();

        if(randomNumber==guessNumber1){
            System.out.println("Correct! Aren't you lucky.");
        }else{
            System.out.println("Guess one more time!.");
            int guessNumber2 = sc.nextInt();
            if(guessNumber2==randomNumber){
                System.out.println("Correct! Aren't you lucky.");
            }else{
            System.out.println("Hard luck! Maybe next time.");
            }
        }
    }
}
