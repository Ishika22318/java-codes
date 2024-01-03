// Area of Rhombus

import java.util.Scanner;

public class kk_6AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of diagonal 1: ");
        double p = sc.nextDouble();
        System.out.println("Enter height of diagonal 2: ");
        double q = sc.nextDouble();
        double area = p * q;
        System.out.println("Area of Rhombus: " + String.format("%.2f", area));
        sc.close();
    }
}
