// Addition of two numbers
import java.util.Scanner;

public class kk_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        int add = a + b;
        System.out.println("Addition of two numbers: "+add);
        sc.close();
    }
}
