package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static void twoSumProblem(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int k = target - arr[i];
            if (map.containsKey(k)) {
                System.out.printf("[ %d, %d ]", map.get(k), i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("[-1, -1]");
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        twoSumProblem(arr, 14);
    }
}
