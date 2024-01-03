import java.util.Scanner;

public class kk_13PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of rhombus: ");
        double s = sc.nextDouble();
        double perimeter = 4 * s;
        System.out.println("Perimeter of rhombus: " + String.format("%.2f", perimeter));
        sc.close();
    }
}
