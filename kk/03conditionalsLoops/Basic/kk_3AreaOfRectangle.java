// Area of rectangle

import java.util.Scanner;

public class kk_3AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of rectangle: ");
        double w = sc.nextDouble();
        System.out.println("Enter length of rectangle: ");
        double l = sc.nextDouble();
        double area = w * l;
        System.out.println("Area of rectangle: " + String.format("%.2f", area));
        sc.close();
    }
}
