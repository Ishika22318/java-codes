// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class kk_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal amount: ");
        int P = sc.nextInt();
        System.out.println("Enter time in years: ");
        float T = sc.nextFloat();
        System.out.println("Enter rate of interest: ");
        float R = sc.nextFloat();

        double ans = P * T * R / 100;
        System.out.println("Your final amount is " + (ans + P));
        sc.close();
    }
}
