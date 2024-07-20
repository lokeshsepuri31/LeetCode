import java.util.Arrays;

public class Easy905 {

    public int[] sortArrayByParity(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                swap(nums, index, i);
                index++;
            }
        }
        return nums;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Easy905 easy905 = new Easy905();
        int[] arr = {3, 1, 2, 4};
        System.out.println(Arrays.toString(easy905.sortArrayByParity(arr)));
    }
}
