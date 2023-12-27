public class Exercise17 {
    public static void main(String[] args) {
        double nums[] = new double[5];
        double sum=0;
        nums[0] = 12;
        nums[1] = 22;
        nums[2] = 223;
        nums[3] = 34;
        nums[4] = 2;

        for(int i=0;i<5;i++){
            sum += nums[i];
        }

        System.out.println("Sum of all elements: "+ sum);
        System.out.println("Average/mean = " + (sum/nums.length));
    }
}
