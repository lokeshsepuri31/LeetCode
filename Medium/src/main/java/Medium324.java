import java.util.Arrays;

public class Medium324 {

    public void wiggleSort(int[] nums) {

        int[] val = new int[nums.length];
        Arrays.sort(nums);

        int i = 1, j = nums.length - 1;

        while (j > -1) {
            if (i >= nums.length) {
                i = 0;
            }
            val[i] = nums[j];
            i += 2;
            j--;
        }

        for (int k = 0; k < val.length; k++)
            nums[k] = val[k];

    }

    public static void main(String[] args) {
        Medium324 medium324 = new Medium324();
        int[] nums = {1, 1, 2, 1, 2, 2, 1};
        medium324.wiggleSort(nums);
    }

}
