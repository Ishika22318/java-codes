import java.util.Scanner;

public class kk_14VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cone: ");
        double r = sc.nextDouble();
        System.out.println("Enter height of cone: ");
        double h = sc.nextDouble();
        double volume = Math.PI * r * r * h / 3;
        System.out.println("Volume of cone: "+String.format("%.2f", volume));
        sc.close();
    }
}
