public class Easy231 {
    public boolean isPowerOfTwo(int n) {
        return isPowerOfTwo(n, 0);
    }

    public boolean isPowerOfTwo(int n, int x) {
        if (n == Math.pow(2, x)) {
            return true;
        } else if (n < Math.pow(2, x)) {
            return false;
        }
        return isPowerOfTwo(n, x + 1);
    }

    public static void main(String[] args) {
        Easy231 easy231 = new Easy231();
        System.out.println(easy231.isPowerOfTwo(16));
    }

}
