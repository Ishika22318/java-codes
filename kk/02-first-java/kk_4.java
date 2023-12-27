// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class kk_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter any operator (+, -, *, /): ");
        char op = sc.next().trim().charAt(0);

        if (op == '+') {
            System.out.println("answer = " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("answer = " + (num1 - num2));
        } else if (op == '*') {
            System.out.println("answer = " + (num1 * num2));
        } else if (op == '/') {
            System.out.println("answer = " + (num1 / num2));
        } else {
            System.out.println("Please enter a valid operator!");
        }

        sc.close();
    }
}
