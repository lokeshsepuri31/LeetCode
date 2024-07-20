import java.util.Arrays;

public class Easy88 {

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        if (n == 0)
//            return;
//        else {
//            int i = nums1.length - 1;
//            int j = 0;
//            while (j < n) {
//                nums1[i] = nums2[j];
//                j++;
//                i--;
//            }
//            quickSort(nums1, 0, nums1.length - 1);
//        }
//    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public int partition(int[] a, int left, int right) {
        int pivot = a[right];
        int j = left;
        for (int i = left; i < right; i++) {
            if (a[i] < pivot) {
                swap(a, i, j);
                j++;
            }
        }
        swap(a, j, right);
        return j;
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Easy88 easy88 = new Easy88();
        int[] nums1 = {-1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0};
        int[] nums2 = {-1, -1, 0, 0, 1, 2};
        easy88.merge(nums1, 5, nums2, 6);
        System.out.println(Arrays.toString(nums1));
    }

}
