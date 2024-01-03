// Area Of Equilateral Triangle

import java.util.Scanner;

public class kk_7AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side of equilateral triangle: ");
        double s = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * s * s;
        System.out.println("Area of equilateral triangle: " + String.format("%.2f", area));
        sc.close();
    }
}
