package problems;

public class LargestElementInArray {

    public static int findLargest(int[] arr, int low, int high) {
        if (low >= high) {
            return arr[low];
        } else if (arr[low] > arr[high]) {
            return findLargest(arr, low, high - 1);
        } else {
            return findLargest(arr, low + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0, 5};
        System.out.println(findLargest(arr, 0, arr.length - 1));
    }
}
