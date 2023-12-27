// To find Armstrong Number between two given number.

import java.util.Scanner;

public class kk_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        for (int i = num1 + 1; i < num2; i++) {
            int length = String.valueOf(i).length();

            int sum = 0, x = i;
            while (x != 0) {
                int digit = x % 10;
                x = x / 10;
                sum += Math.pow(digit, length);
            }

            if (sum == i) {
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
}