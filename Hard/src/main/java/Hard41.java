import java.util.Arrays;

public class Hard41 {

    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        int sequence = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] == sequence)
                    sequence++;
                else if (nums[i] < sequence) {
                    continue;
                } else
                    return sequence;
            }
        }
        return sequence;

    }

    public static void main(String[] args) {
        Hard41 hard41 = new Hard41();
        int[] nums = {0, 1, 1, 2, 2};
        System.out.println(hard41.firstMissingPositive(nums));
    }

}
