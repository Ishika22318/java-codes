import java.util.Scanner;

public class kk_20TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side length of cube: ");
        double a = sc.nextDouble();
        double volume = 6 * a * a;
        System.out.println("Total surface area of cube: "+volume);
        sc.close();
    }
}
