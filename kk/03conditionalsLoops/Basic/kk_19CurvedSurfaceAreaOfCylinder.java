import java.util.Scanner;

public class kk_19CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        double r = sc.nextDouble();
        System.out.println("Enter height of cylinder: ");
        double h = sc.nextDouble();
        double volume = 2 * Math.PI * r * h;
        System.out.println("Curved Surface Area of cylinder: "+ volume);
        sc.close();
    }
}
