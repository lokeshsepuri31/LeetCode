import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Easy349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return intersection(nums2, nums1);
        }

        List<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (!findNumber(nums2, j - 1, nums1[i])) {
                    ans.add(nums1[i]);
                    j++;
                    i = -1;
                }
            }
            if (i == nums1.length - 1) {
                j++;
                i = -1;
            }
            i++;

        }

        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }

    public boolean findNumber(int[] arr, int index, int target) {
        if (index == -1) {
            return false;
        }
        for (int i = 0; i <= index; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Easy349 easy349 = new Easy349();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

//        int[] nums1 = {4, 7, 9, 7, 6, 7};
//        int[] nums2 = {5, 0, 0, 6, 1, 6, 2, 2, 4};

        System.out.println(Arrays.toString(easy349.intersection(nums1, nums2)));
    }
}
