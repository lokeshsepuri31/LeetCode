public class Easy746 {

    public int minCostClimbingStairs(int[] cost) {

        if (cost.length < 4) {
            Math.min(cost[0], cost[1]);
        }

        int n = cost.length;
        int[] dp = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        return Math.min(findMinCost(cost, dp, 0), findMinCost(cost, dp, 1));

    }

    private int findMinCost(int[] arr, int[] dp, int index) {
        if (index == arr.length - 1 || index == arr.length - 2) {
            return arr[index];
        }
        if (dp[index] != Integer.MAX_VALUE) {
            return dp[index];
        }
        dp[index] = arr[index] + Math.min(findMinCost(arr, dp, index + 1), findMinCost(arr, dp, index + 2));

        return dp[index];
    }

    public static void main(String[] args) {
        Easy746 easy746 = new Easy746();
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(easy746.minCostClimbingStairs(cost));
    }
}
