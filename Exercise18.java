import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        String favFood[] = new String[3];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your top 5 favourite food items: ");
        for(int i = 0; i<3; i++){
            favFood[i] = sc.nextLine();
        }
        System.out.println("\nNo more memory available. \nYour favourite foods are:");
        for(int i=0;i<3;i++){
            System.out.println(favFood[i]);
        }
    }
}
