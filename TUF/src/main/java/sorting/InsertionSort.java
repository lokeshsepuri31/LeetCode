package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        sort(arr, arr.length);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
