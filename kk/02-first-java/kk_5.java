// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class kk_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is largest.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is largest");
        } else {
            System.out.println("Both are equal.");
        }
        sc.close();
    }
}
