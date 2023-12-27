import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correct_password = "shark50";
        String input_password; 

        do{
            System.out.println("Please enter your password: ");
            input_password = sc.next();
        }while(!input_password.equals(correct_password));

        System.out.println("ACCESS APPROVED!");

    }
}
