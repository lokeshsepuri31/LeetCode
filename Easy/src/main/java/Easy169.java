import java.util.Arrays;

public class Easy169 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static int majorityElement2(int[] nums) {
        int count = 0, element =0, n = nums.length;
        for(int i =0;i < n;i++) {
            if(count == 0) {
                count = 1;
                element = nums[i];
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for(int i=0;i<n;i++) {
            if(nums[i] == element) {
                count1++;
            }
        }
        return count1 > n/2 ? element: -1;
    }

    public static void main(String[] args) {
        Easy169 easy169 = new Easy169();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int[] nums1 = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(majorityElement2(nums1));
    }
}
