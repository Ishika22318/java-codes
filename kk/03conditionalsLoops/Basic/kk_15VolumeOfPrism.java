import java.util.Scanner;

public class kk_15VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter area of base: ");
        double b = sc.nextDouble();
        System.out.println("Enter height of prism: ");
        double h = sc.nextDouble();
        double volume= b * h;
        System.out.println("Volume o prism: "+String.format("%.2f", volume));
        sc.close();
    }
}
