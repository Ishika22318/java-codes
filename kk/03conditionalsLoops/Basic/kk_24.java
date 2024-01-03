// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class kk_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum=0;
        do{
            System.out.println("Enter an integer to find largest or enter 0 to exit: ");
            n = sc.nextInt();
            sum += n;
        } while (n != 0);
        System.out.println("Sum: "+sum);
        sc.close();
    }    
}
