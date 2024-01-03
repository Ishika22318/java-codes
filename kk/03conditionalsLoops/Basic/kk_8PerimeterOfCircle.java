// Perimeter of Circle

import java.util.Scanner;

public class kk_8PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double r = sc.nextDouble();
        double perimeter = 2 * Math.PI * r;
        System.out.println("Perimeter of circle: " + String.format("%.2f", perimeter));
        sc.close();
    }
}
