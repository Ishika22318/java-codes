import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;
        System.out.println("Enter first number: ");
        x = sc.nextInt();
        System.out.println("Enter second number: ");
        y = sc.nextInt();

        if(x>y){
            System.out.println(x + " is greater than " + y);
            System.out.println("Difference between numbers: " + (x-y));
        }else if(x<y){
            System.out.println(x + " is less than " + y);
            System.out.println("Difference between numbers: " + -(x-y));
        }else{
            System.out.println(x + " equals to " + y);
        }
        

    }
}
