public class Easy541 {
    public String reverseStr(String s, int k) {

        int start = 0, end = k, n = s.length();

        if (end > n || end == 1) {
            return s;
        }

        String ans = "";

        while (start <= n) {
            ans += reverseString(s, start, end);
            if ((end + k) < s.length()) {
                ans += s.substring(end, end + k);
            } else {
                ans += s.substring(end, s.length());
            }
            start = 2 * end;
            end = start + k;
        }

        return ans;
    }

    private String reverseString(String s, int start, int end) {

        String reverse = "";
        for (int i = end - 1; i >= start; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 3;
        Easy541 easy541 = new Easy541();
        System.out.println(easy541.reverseStr(s, k));
    }
}
