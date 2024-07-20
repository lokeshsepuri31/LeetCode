import java.util.Arrays;

public class Easy27 {
    public static void main(String[] args) {
        Easy27 easy27 = new Easy27();
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(easy27.removeElement(nums,2));
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == val){
                count++;
                nums[i] = Integer.MAX_VALUE;
            }
        }

        Arrays.sort(nums);

        return nums.length - count;
    }
}
