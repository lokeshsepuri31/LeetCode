package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr, int n) {
        for (int i = n-1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap==0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        sort(arr, arr.length);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
