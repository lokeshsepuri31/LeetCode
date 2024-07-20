import java.util.Arrays;

public class Medium739 {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] ans = new int[n];

        int i = 0, j = 1;

        while (i < n && j < n) {
            if (temperatures[i] < temperatures[j]) {
                ans[i] = j - i;
                i++;
                j = i + 1;
            } else if (j == n - 1) {
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] arr = {30, 40, 50, 60};
        Medium739 medium739 = new Medium739();

        System.out.println(Arrays.toString(medium739.dailyTemperatures(arr)));
    }

}
