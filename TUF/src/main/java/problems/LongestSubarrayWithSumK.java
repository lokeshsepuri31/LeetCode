package problems;

public class LongestSubarrayWithSumK {


    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int i = 0, j = 0;
        int n = arr.length;
        int len = 0;
        while (i < n && j < n) {
            int sum = sum(arr, i, j);
            if (sum > k) {
                i++;
                j--;
            } else if (sum == k) {
                len = Math.max(len, j - i + 1);
            }
            j++;
        }

        return len;
    }

    public static int sum(int[] arr, int i, int j) {
        int sum = 0;

        for (int k = i; k < j + 1; k++) {
            sum += arr[k];
        }

        return sum;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 1, 1, 1, 1, 3, 3};
        int[] arr = {2,3,5};
        System.out.println(longestSubarrayWithSumK(arr, 5));
    }
}
