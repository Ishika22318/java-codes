import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise8 {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 to 5");
        int guessNumber = sc.nextInt();

        if(randomNumber==guessNumber){
            System.out.println("Correct! Aren't you lucky.");
        }else{
            System.out.println("Hard luck! Maybe next time.");
        }
    }
}
