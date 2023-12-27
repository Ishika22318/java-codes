import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total bill amount to be paid.");
        double totalBill = sc.nextDouble();

        System.out.println("Enter no. of memebers to split bill.");
        int noOfMembers = sc.nextInt();

        System.out.format("Every member have to pay %.3f" , totalBill/noOfMembers);
    }    
}
