import java.util.Arrays;
import java.util.Stack;

public class Easy496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {


        int ans[] = new int[nums1.length];
        int i = 0;
        while (i < nums1.length) {
            int j = findindex(nums2, nums1[i]);
            Stack stack = new Stack<>();
            if (j != nums2.length - 1) {
                while (j < nums2.length) {

                    if (!stack.isEmpty() && (int) stack.peek() < nums2[j]) {
                        stack.pop();
                        stack.push(nums2[j]);
                        break;
                    }

                    stack.push(nums2[j]);
                    j++;
                }
            }
            ans[i] = stack.isEmpty() ? -1 : (int) stack.pop();
            i++;
        }
        return ans;

    }

    public int findindex(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Easy496 easy496 = new Easy496();
//        int[] a = easy496.nextGreaterElement(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7});
        int[] a = easy496.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        for (int ans : a) {
            System.out.print(ans + " ");
        }
    }
}
