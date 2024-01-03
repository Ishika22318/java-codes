// Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class kk_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        System.out.print("Factors of "+n+" are ");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(n);
        sc.close();
    }    
}
