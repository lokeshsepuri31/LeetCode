package problems;

public class CheckArrayIsSorted {

    public static boolean checkArrayIsSorted(int[] arr, int low, int high) {

        if (low == high) {
            return arr[low - 1] <= arr[high];
        }

        if (low + 1 == high) {
            return arr[low] <= arr[high];
        }

        int mid = (low + high) / 2;

        return checkArrayIsSorted(arr, low, mid) && checkArrayIsSorted(arr, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(checkArrayIsSorted(arr, 0, arr.length - 1));
    }
}
