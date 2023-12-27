// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class kk_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your good name: ");
        String name = sc.next().trim();
        System.out.println("Heyyyy " + name + "!!! Have a nice day :)");

        sc.close();
    }
}
