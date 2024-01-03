import java.util.Scanner;

public class kk_11PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of rectangle: ");
        double w = sc.nextDouble();
        System.out.println("Enter length of rectangle: ");
        double l = sc.nextDouble();
        double perimeter = 2 * (w + l);
        System.out.println("Perimeter of rectangle: " + String.format("%.2f", perimeter));
        sc.close();
    }
}
