import java.util.Arrays;

public class Medium2149 {

    public static int[] rearrangeArray(int[] nums) {
        int pos = 0, neg = 1;
        int n = nums.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[neg] = nums[i];
                neg += 2;
            } else {
                ans[pos] = nums[i];
                pos += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, -2, -5, 2, -4};
        Arrays.stream(rearrangeArray(arr)).forEach(System.out::println);
    }
}