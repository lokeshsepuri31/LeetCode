import java.util.Arrays;

public class Medium2433 {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] ans = new int[n];
        ans[0] = pref[0];
        for (int i = 1; i < n; i++) {
            ans[i] = pref[i] ^ pref[i - 1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] pref = {5, 2, 0, 3, 1};
        Medium2433 medium2433 = new Medium2433();
        System.out.println(Arrays.toString(medium2433.findArray(pref)));
    }
}