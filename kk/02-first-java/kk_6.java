// Input currency in rupees and output in USD.

import java.util.Scanner;

public class kk_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in rupees: ");
        int amount = sc.nextInt();
        float ans = amount * 0.012019f;
        System.out.println("Your amount in USD is " + ans);
        sc.close();
    }
}
