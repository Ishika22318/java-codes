// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class kk_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number up to which you want to print fibonacci series: ");
        int n = sc.nextInt();
        System.out.print("0 1 ");

        int a = 0, b = 1, c = 2;
        while (c < n) {
            System.out.print(a + b + " ");
            int temp = b;
            b += a;
            a = temp;
            c++;
        }
        sc.close();
    }
}
