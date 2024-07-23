import java.util.HashMap;
import java.util.Map;

public class Medium560 {

	public static int subarraySum(int[] nums, int k) {
		int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += nums[i];

            int remove = preSum - k;

            cnt += (int) mpp.getOrDefault(remove, 0);

            mpp.put(preSum, (int) mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 1, 1 };
		int[] arr = { 1, -1, -1 };
		int k = 0;
		System.out.println(subarraySum(arr, k));
	}
}
