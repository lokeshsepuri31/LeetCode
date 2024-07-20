import java.util.Arrays;

public class Easy26 {

    public int removeDuplicates(int[] nums) {
        int start = 0;
        int end = 1;

        while (end < nums.length) {
            if (nums[start] != nums[end]) {
                if (start + 1 != end) {
                    nums[start + 1] = nums[end];
                }
                start++;
            }
            end++;
        }

        return start + 1;
    }

    public static void main(String[] args) {
        Easy26 easy26 = new Easy26();
        int[] nums = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4};
        int[] nums1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums2 = {1, 1, 2};
        System.out.println(easy26.removeDuplicates(nums2));
    }
}
