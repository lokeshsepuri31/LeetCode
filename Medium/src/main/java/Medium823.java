import java.util.*;

public class Medium823 {
    private static final int MOD = 1000000007;

    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);

        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        Map<Integer, Integer> dp = new HashMap<>();
        for (int num : arr) {
            dp.put(num, 1);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > Math.sqrt(arr[i])) break;

                if (arr[i] % arr[j] == 0 && uniqueNumbers.contains(arr[i] / arr[j])) {
                    long product = (long) dp.get(arr[j]) * dp.get(arr[i] / arr[j]);

                    dp.put(arr[i], (int) ((dp.get(arr[i]) + (arr[i] / arr[j] == arr[j] ? product : product * 2)) % MOD));
                }
            }
        }

        int result = 0;
        for (int value : dp.values()) {
            result = (result + value) % MOD;
        }
        return result;
    }

    public static void main(String[] args) {
        Medium823 medium823 = new Medium823();
        int[] arr = {2, 4};
        System.out.println(medium823.numFactoredBinaryTrees(arr));
    }
}
