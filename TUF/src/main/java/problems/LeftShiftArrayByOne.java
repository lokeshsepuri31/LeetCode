package problems;

import java.util.Arrays;

public class LeftShiftArrayByOne {

    public static void reverseArray(int[] arr, int start, int end) {
        end--; // we need to trim the last element
        while(start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            end--;
            start++;
        }
    }

    public static void leftShift(int[] arr, int k) {
        reverseArray(arr, 0, k);
        reverseArray(arr, k, arr.length);
        reverseArray(arr, 0, arr.length);
    }

    public static void rightShift(int[] arr, int k) {
        reverseArray(arr, arr.length - k, arr.length);
        reverseArray(arr, 0 , arr.length - k);
        reverseArray(arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 10;
        int n = arr.length;
//        leftShift(arr, k % n);
        rightShift(arr, k % n);
        Arrays.stream(arr).forEach(System.out::print);
    }
}
