import java.util.Arrays;
import java.util.Stack;

public class Easy1475 {

    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        Arrays.fill(ans, -1);

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    ans[i] = prices[i] - prices[j];
                    break;
                }
            }
            if (ans[i] == -1) {
                ans[i] = prices[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Easy1475 easy1475 = new Easy1475();
        int[] prices = {8, 4, 6, 2, 3};
        int[] prices1 = {1, 2, 3, 4, 5};
        int[] prices2 = {10, 1, 1, 6};
        int[] ans = easy1475.finalPrices(prices2);
        for (int answer : ans) {
            System.out.println(answer);
        }
    }
}
