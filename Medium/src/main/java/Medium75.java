import java.util.Arrays;

public class Medium75 {

    public void sortColors(int[] nums) {

        int low = 0,mid = 0,high = nums.length -1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }else {
                swap(nums,mid,high);
                high--;
            }
        }


        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] arr, int low, int high){
        int temp = arr[high];
        arr[high] = arr[low];
        arr[low]= temp;
    }

    public static void main(String[] args) {
        Medium75 medium75 = new Medium75();
        int[] nums = {1, 0, 2, 2, 0, 1};
        medium75.sortColors(nums);
    }
}
