package problems;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void moveZeroes(int[] nums) {

        int i = 0,j = 0;
        int temp;

        while(i < nums.length) {
            if(nums[j] == 0 && nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (nums[i] == 0) {
                i++;
            } else {
                i++;
                j++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
//        int arr[] = {0,0,1};
//        int[] arr = {1,0,2,3,2,0,0,4,5,1,0};
        moveZeroes(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }
}
