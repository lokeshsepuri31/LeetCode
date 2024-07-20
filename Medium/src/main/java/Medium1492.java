public class Medium1492 {

    public int kthFactor(int n, int k) {

        if (n < k) {
            return -1;
        }

        int factor = 1;
        k -= 1;
        int i = 2;

        while (k != 0 && i <= n) {
            if (n % i == 0) {
                factor = i;
                k--;
            }
            i++;
        }

        if (k != 0) {
            return -1;
        }

        return factor;
    }

    public static void main(String[] args) {
        Medium1492 medium1492 = new Medium1492();
        System.out.println(medium1492.kthFactor(4, 4));
    }
}
