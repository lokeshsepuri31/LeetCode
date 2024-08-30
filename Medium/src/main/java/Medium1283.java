
public class Medium1283 {

	public static int smallestDivisor(int[] nums, int threshold) {

		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;

		for (int i : nums) {
			low = Math.min(low, i);
			high = Math.max(high, i);
		}

		if (nums.length == threshold) {
			return high;
		}

		while (low <= high) {
			int mid = (low + high) / 2;

			if (calSumOfDivisor(nums, mid, threshold)) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}

	private static boolean calSumOfDivisor(int[] nums, int divisor, int threshold) {
		int sum = 0;
		for (int i : nums) {
			sum += Math.ceil((double) i / (double) divisor);
		}

		return sum <= threshold;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 5, 9 };
		int limit = 6;
		System.out.println(smallestDivisor(nums, limit));
	}

}
