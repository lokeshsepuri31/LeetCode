public class Hard10 {

    public boolean isMatch(String s, String p) {

        int i = 0, j = 0, n = s.length(), m = p.length();

        while (i < n && j < m) {
            char charS = s.charAt(i);
            char charP = p.charAt(j);
            if (charP == charS) {
                i++;
                j++;
            } else if (charP == '.') {
                i++;
                j++;
            } else if (charP == '*') {
                if (i + 1 < n && s.charAt(i + 1) == charS) {
                    i++;
                } else {
                    i++;
                    j++;
                }
            }else {
                j++;
            }
        }

        return i == n;
    }

    public static void main(String[] args) {
        Hard10 hard10 = new Hard10();
        String s = "aabaa", p = "a*.*";
        String s1 = "aa", p1 = "a*.*";
        String s2 = "aa", p2 = "a*";
        String s3 = "aa", p3 = "a";
        String s4 = "ab", p4 = ".*";
        String s5 = "aab", p5 = "c*a*b";
        System.out.println(hard10.isMatch(s3, p3));
    }
}
