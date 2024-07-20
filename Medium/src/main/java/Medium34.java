import java.util.Arrays;

public class Medium34 {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int startIndex = -1;
        int endIndex = -1;
        boolean found = false;
        for(int i = 0;i<nums.length;i++) {
            if(startIndex == -1 && nums[i] == target) {
                startIndex = i;
                found = true;
            }
            if(found == true && nums[i] == target) {
                endIndex = i;
            }
        }

        ans[0] = startIndex;
        ans[1] = endIndex;
        return ans;
    }

    public static void main(String[] args) {
        Medium34 medium34 = new Medium34();
        int[] nums = {5,7,7,8,8,8,8,8,10};
        System.out.println(Arrays.toString(medium34.searchRange(nums,8)));
    }

}
