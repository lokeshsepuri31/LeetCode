import java.util.Arrays;

public class Hard2009 {

    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int minOperations = Integer.MAX_VALUE;
        int sequenceLength = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                if (nums[i] + 2 == nums[i + 1]) {
                    sequenceLength++;
                }
                minOperations = Math.min(minOperations, (nums.length - sequenceLength));
                sequenceLength = 1;
            } else {
                sequenceLength++;
            }
        }
        minOperations = Math.min(minOperations, nums.length - sequenceLength);

        return minOperations == Integer.MAX_VALUE ? 0 : minOperations;
    }

    public static void main(String[] args) {
        Hard2009 hard2009 = new Hard2009();
        int[] nums = {2, 100,99,98,97};
        System.out.println(hard2009.minOperations(nums));
    }
}
