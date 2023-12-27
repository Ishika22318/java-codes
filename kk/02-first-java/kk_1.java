// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

class kk_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        sc.close();
    }
}