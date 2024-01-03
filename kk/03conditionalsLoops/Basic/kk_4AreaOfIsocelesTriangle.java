// Area of Isoceles Triangle

import java.util.Scanner;

public class kk_4AreaOfIsocelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of a triangle: ");
        double h = sc.nextDouble();
        System.out.println("Enter base of a triangle: ");
        double b = sc.nextDouble();
        double area = (b * h) / 2;
        System.out.println("Area of triangle: " + String.format("%.2f", area));
        sc.close();
    }
}
