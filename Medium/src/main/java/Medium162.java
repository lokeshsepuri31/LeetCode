
public class Medium162 {

	public static int findPeakElement(int[] nums) {
		return peak(nums, 0, nums.length - 1);
	}

	public static int peak(int[] nums, int low, int high) {

		if(low == high) {
			return low;
		}
		
		int mid = (low + high) / 2;

		if (mid - 1 >= low && nums[mid - 1] > nums[mid]) {
			return peak(nums, low, mid - 1);
		} else if(mid+1 <= high && nums[mid] < nums[mid + 1]){
			return peak(nums, mid+1, high);
		} else {
			return mid;
		}
		
	}
	
	public static void main(String[] args) {
		
//		int[] nums = {1,2,3,1};
		int[] nums = {1,2};
		
		System.out.println(findPeakElement(nums));
	}

}
