import java.util.Scanner;

public class kk_17VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of sphere: ");
        double r = sc.nextDouble();
        double volume = 4 * Math.PI * r * r * r / 3;
        System.out.println("volume of sphere: "+volume);
        sc.close();
    }
}
