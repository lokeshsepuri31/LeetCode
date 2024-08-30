public class Easy1539 {

	public int findKthPositive(int[] arr, int k) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int missing = arr[mid] - (mid + 1);
			if (missing < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return k + high + 1;
	}

	public static void main(String[] args) {
		Easy1539 easy1539 = new Easy1539();
//        int[] arr = {2,3,4,7,11};
		int[] arr = { 1, 2, 3, 4 };
		int k = 2;
		System.out.println(easy1539.findKthPositive(arr, k));
	}
}
