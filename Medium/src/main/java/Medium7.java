public class Medium7 {

//    public int reverse(int x) {
//
//        boolean isSigned = false;
//        long ans = 0;
//
//        if (x < 0) {
//            isSigned = true;
//            x = Math.abs(x);
//        }
//        while (x > 0) {
//            int rem = x % 10;
//            ans = (ans + rem) * 10;
//            x /= 10;
//        }
//        ans /= 10;
//        if (isSigned) {
//            ans = (~(ans - 1));
//        }
//
//        if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
//            return 0;
//        }
//
//        return (int) ans;
//    }

    public int reverse(int x) {

        int ans = 0;

        while (x!=0) {
            int rem = x % 10;
            ans = (ans + rem) * 10;
            x /= 10;
        }
        ans /= 10;

        if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
            return 0;
        }

        return x<0 ? -1 * ans : ans;
    }

    public static void main(String[] args) {

        Medium7 medium7 = new Medium7();
        int x = -15342;

        System.out.println(medium7.reverse(x));

//        System.out.println(964632435*10);

    }

}
