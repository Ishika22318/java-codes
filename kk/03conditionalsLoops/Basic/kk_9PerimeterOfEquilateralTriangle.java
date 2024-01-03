// Perimeter of Equilateral Triangle

import java.util.Scanner;

public class kk_9PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side of equilateral triangle: ");
        double s = sc.nextDouble();
        double perimeter = 3 * s;
        System.out.println("Perimeter Of Equilateral Triangle: " + String.format("%.2f", perimeter));
        sc.close();
    }
}