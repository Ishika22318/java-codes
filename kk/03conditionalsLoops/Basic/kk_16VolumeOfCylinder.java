import java.util.Scanner;

public class kk_16VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        double r = sc.nextDouble();
        System.out.println("Enter height of cylinder: ");
        double h = sc.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume of cylinder: "+String.format("%.2f", volume));
        sc.close();
    }
}
