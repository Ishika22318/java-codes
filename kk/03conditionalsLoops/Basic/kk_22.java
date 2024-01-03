// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class kk_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int product=1, sum=0;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;
            product *= r;
            sum += r;
        }
        int ans = product - sum;
        System.out.println(ans);
        sc.close();
    }
}
