package sorting;

import java.util.Arrays;

public class RecursiveSort {

    static void insertion_sort(int[] arr, int i, int n) {
        // Base Case: i == n.
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertion_sort(arr, i + 1, n);

    }

    static void bubble_sort(int[] arr, int n) {
        //Base case: range == 1.
        if (n == 1) return;
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        //Range reduced after recursion:
        bubble_sort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        bubble_sort(arr, arr.length);
        System.out.print("This is bubble sort: ");
        Arrays.stream(arr).forEach(System.out::print);
        System.out.print("\nThis is insertion sort: ");
        int[] arr1 = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        insertion_sort(arr1, 0, arr.length);
        Arrays.stream(arr1).forEach(System.out::print);
    }
}
