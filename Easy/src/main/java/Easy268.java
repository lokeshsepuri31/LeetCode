import java.util.Arrays;

public class Easy268 {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int result = (n * (n + 1)) / 2;

        int sum = sum(nums);

        return result - sum;
    }

    private int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Easy268 easy268 = new Easy268();
        int[] nums = {3, 0, 1};
        System.out.println(easy268.missingNumber(nums));
    }

}
