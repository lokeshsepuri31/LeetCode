import java.util.Arrays;

public class Medium31 {

    public void nextPermutation(int[] nums) {

        int n = nums.length - 1;
        int index = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(nums, 0, n);
        } else {

            for (int i = n; i >= 0; i--) {
                if (nums[index] < nums[i]) {
                    swap(nums, index, i);
                    break;
                }
            }

            reverse(nums, index + 1, n);
        }

        System.out.println(Arrays.toString(nums));

    }

    private void swap(int[] nums, int i, int j) {
        if(i == j){
            return;
        }
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }

    private void reverse(int[] nums, int start, int end) {
        int mid = (end + start) / 2;
        int k = start;
        if (start % 2 == 0 && end % 2 == 0) {
            while (k < mid) {
                swap(nums, start++, end--);
                k++;
            }

        } else {
            while (k <= mid) {
                swap(nums, start++, end--);
                k++;
            }
        }
    }

    public static void main(String[] args) {
        Medium31 medium31 = new Medium31();
//        int[] nums = {2, 1, 5, 3, 4, 0, 0, 0};
//        int[] nums = {3, 2, 1};
//        int[] nums = {1, 2, 3};
        int[] nums = {1, 2};
        medium31.nextPermutation(nums);
    }
}
