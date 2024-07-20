public class Easy121 {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;

        for (int price : prices) {
            min = Math.min(price, min);
            int profit = price - min;
            max = Math.max(max,profit);
        }

        return max;
    }


    public static void main(String[] args) {
        int[] prices = {2, 1, 2, 1, 0, 1, 2};
        Easy121 easy121 = new Easy121();
        System.out.println(easy121.maxProfit(prices));
    }
}
