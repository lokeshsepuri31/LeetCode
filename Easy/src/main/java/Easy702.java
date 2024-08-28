
public class Easy702 {

	public static int search(int[] nums, int target) {
		return binarySearch(nums, 0, nums.length - 1, target);
	}

	private static int binarySearch(int[] nums, int low, int high, int target) {

		int mid = (low + high) / 2;

		if (nums[mid] == target)
			return mid;

		if (low >= high)
			return -1;

		if (target > nums[mid]) {
			return binarySearch(nums, mid + 1, high, target);
		} else {
			return binarySearch(nums, low, mid - 1, target);
		}

	}

	public static void main(String[] args) {
		int[] arr = {-1,0,3,5,9,12};
		System.out.println(search(arr, 12));
	}
}
