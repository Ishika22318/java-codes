import java.util.Scanner;

public class kk_12PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        double s = sc.nextDouble();
        double perimeter = 4 * s;
        System.out.println("Perimeter of square: " + String.format("%.2f", perimeter));
        sc.close();
    }
}
