// Area of Circle Java Program

import java.util.Scanner;

public class kk_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of circe: " + String.format("%.2f", area));
        sc.close();
    }
}
