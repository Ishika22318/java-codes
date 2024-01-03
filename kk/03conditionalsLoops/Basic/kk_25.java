// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class kk_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, max=0;
        do{
            System.out.println("Enter an integer to find largest or enter 0 to exit: ");
            n = sc.nextInt();
            if (n > max) {
                max = n;
            }
        } while (n != 0);
        System.out.println("Largest number: "+max);
        sc.close();
    }    
}
