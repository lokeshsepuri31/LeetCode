import java.util.Random;

public class Medium215 {

    public int findKthLargest(int[] nums, int k) {
        int right = nums.length - 1, left = 0;
        while (true) {
            int pivot = new Random().nextInt(right - left + 1) + left;
            int new_pivot = partition(nums, left, right, pivot);
            if (new_pivot == nums.length - k) {
                return nums[new_pivot];
            } else if (new_pivot > nums.length - k) {
                right = new_pivot - 1;
            } else
                left = new_pivot + 1;
        }
    }

    public int partition(int[] nums, int left, int right, int pivot) {
        int pivotValue = nums[pivot];
        swap(nums, pivot, right);
        int storedindex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, i, storedindex);
                storedindex++;
            }
        }
        swap(nums, right, storedindex);
        return storedindex;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Medium215 medium215 = new Medium215();
        int arr[] = {3, 2, 3, 1, 2, 4, 5, 5, 6};
//        int arr[] = {3, 2, 1, 5, 6, 4};
//        int arr[] = {-1,-1};
        System.out.println(medium215.findKthLargest(arr, 4));
    }
}
