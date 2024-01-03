import java.util.Scanner;

public class kk_10PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of parallelogram: ");
        double b = sc.nextDouble();
        System.out.println("Enter side of parallelogram: ");
        double s = sc.nextDouble();
        double perimeter = 2 * (b + s);
        System.out.println("Perimeter of parallelogram: " + String.format("%.2f", perimeter));
        sc.close();
    }
}
