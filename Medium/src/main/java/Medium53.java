public class Medium53 {

    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            max = max(sum, max);
            if (sum < 0)
                sum = 0;
        }

        return max;
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Medium53 medium53 = new Medium53();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(medium53.maxSubArray(nums));
    }
}

