public class Easy1539 {

    public int findKthPositive(int[] arr, int k) {
        int count = 1, i = 0;
        while (i < arr.length && k != 0) {
            if (arr[i] != count) {
                k--;
            } else {
                i++;
            }
            count++;
        }

        return (count - 1) + k;
    }

    public static void main(String[] args) {
        Easy1539 easy1539 = new Easy1539();
//        int[] arr = {2,3,4,7,11};
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        System.out.println(easy1539.findKthPositive(arr, k));
    }
}
