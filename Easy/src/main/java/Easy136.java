public class Easy136 {

    public static int getSingleElement(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++)
            unique ^= arr[i];
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(getSingleElement(arr));
    }
}
