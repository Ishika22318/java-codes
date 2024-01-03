import java.util.Scanner;

public class kk_18VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of pyramid: ");
        double l = sc.nextDouble();
        System.out.println("Enter width of pyramid: ");
        double w = sc.nextDouble();
        System.out.println("Enter height of pyramid: ");
        double h = sc.nextDouble();
        double volume = l * w * h / 3;
        System.out.println("Volume of pyramid: " + volume);
        sc.close();
    }
}
