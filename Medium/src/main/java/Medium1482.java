
public class Medium1482 {

	public static int minDays(int[] bloomDay, int m, int k) {

		long val = (long) m * k;
        int n = bloomDay.length; // Size of the array
        if (val > n) return -1;

		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i : bloomDay) {
			max = Math.max(max, i);
			min = Math.min(min, i);
		}

		int low = min;
		int high = max;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (possible(bloomDay, mid, m, k)) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return low;

	}

	public static boolean possible(int[] arr, int day, int m, int k) {
		int n = arr.length; // Size of the array
		int cnt = 0;
		int noOfB = 0;
		// Count the number of bouquets:
		for (int i = 0; i < n; i++) {
			if (arr[i] <= day) {
				cnt++;
			} else {
				noOfB += (cnt / k);
				cnt = 0;
			}
		}
		noOfB += (cnt / k);
		return noOfB >= m;
	}

	public static void main(String[] args) {
		int[] bloomDay = { 7, 7, 7, 7, 13, 11, 12, 7 };
		int m = 2, k = 3;
		System.out.println(minDays(bloomDay, m, k));
	}
}
