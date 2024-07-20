package basicrecursion;

public class ReverseArray {

    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        reverseArray(arr, 0, arr.length - 1);
        printArray(arr, arr.length);
    }
}
