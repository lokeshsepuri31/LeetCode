package problems;

public class SecondLargestInArray {

    public static int findSecondLargest(int[] arr, int n) {

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < n; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (largest != arr[i] && secondLargest < arr[i]) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        System.out.println(findSecondLargest(arr, arr.length));
    }
}
