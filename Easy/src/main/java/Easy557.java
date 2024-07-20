public class Easy557 {

    public String reverseWords(String s) {

        String ans = "";

        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                ans += reverseString(s, start, i) + " ";
                start = i + 1;
            } else if (i == s.length() - 1) {
                ans += reverseString(s, start, i + 1);
            }
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
        Easy557 easy557 = new Easy557();
        String s = "Let's take LeetCode contest";
        System.out.println(easy557.reverseWords(s));
    }
}
