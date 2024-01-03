// Area of Parallelogram

import java.util.Scanner;

public class kk_5AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of parallelogram: ");
        double b = sc.nextDouble();
        System.out.println("Enter height of parallelogram: ");
        double h = sc.nextDouble();
        double area = b * h;
        System.out.println("Area of parallelogram: " + String.format("%.2f", area));
        sc.close();
    }
}
