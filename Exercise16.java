public class Exercise16 {
    public static void main(String[] args) {
        int nums[] = new int[20];

        for(int i=0;i<nums.length;i++){
            nums[i] = i+1;
        }

        for(int i=nums.length-1; i>=0;i--){
            System.out.println(nums[i]);
        }
    }
}
