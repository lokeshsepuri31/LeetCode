import java.util.Arrays;

class Easy66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        int sum = digits[0];

        if (digits[n - 1] == 9) {
            int i = n - 1;
            while (digits[i] >= 9 && i != 0) {
                digits[i] = 0;
                if (digits[i - 1] < 9) {
                    digits[i - 1] += 1;
                    break;
                }
                i--;
                if (i == 0)
                    break;
            }
            if (i == 0) {
                int[] ans = new int[digits.length + 1];
                if (sum == 9)
                    ans[0] = 1;
                return ans;
            }
            return digits;
        } else {
            digits[n - 1] += 1;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 2, 6, 5, 7, 1, 9, 0, 3, 8, 6, 8, 6, 5, 2, 1, 8, 7, 9, 8, 3, 8, 4, 7, 2, 5, 8, 9};
        Easy66 main = new Easy66();
        int ans[] = main.plusOne(nums);
        System.out.println(Arrays.toString(ans));
    }
}