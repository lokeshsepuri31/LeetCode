public class Hard1326 {

    public int minTaps(int n, int[] ranges) {

        int min = 0;
        int max = 0;
        int index = 0;
        int open = 0;

        while (max < n) {

            for (int i = index; i < ranges.length; i++) {
                if (i - ranges[i] <= min && i + ranges[i] > max) {
                    max = i + ranges[i];
                    index = i;
                }
            }

            if (min == max) return -1;

            open++;
            min = max;

        }
        return open;
    }

    public static void main(String[] args) {
        Hard1326 hard1326 = new Hard1326();
        int[] ranges = {3, 4, 1, 1, 0, 0};
        System.out.println(hard1326.minTaps(ranges.length - 1, ranges));
    }
}
