import java.util.Arrays;

public class Hard32 {
    public int longestValidParentheses(String s) {

        if (s.length() < 2) {
            return 0;
        }

        int j = 0;
        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(")") && i != 0 ) {
                if (j<i && String.valueOf(s.charAt(i - j - 1)).equals("("))
                    j += 2;
                else {
                    ans[i] = j;
                    j = 0;
                }
            }
        }
        Arrays.sort(ans);
        return Math.max(j,ans[ans.length - 1]);
    }

    public static void main(String[] args) {
        Hard32 hard32 = new Hard32();
//        System.out.println(hard32.longestValidParentheses(")()())"));
//        System.out.println(hard32.longestValidParentheses("(()"));
        System.out.println(hard32.longestValidParentheses("()(())"));
//        System.out.println(hard32.longestValidParentheses(""));
//        System.out.println(hard32.longestValidParentheses(")((())"));
//        System.out.println(hard32.longestValidParentheses("((("));
//        System.out.println(hard32.longestValidParentheses("()))"));
//        System.out.println(hard32.longestValidParentheses("()(()"));
//        System.out.println(hard32.longestValidParentheses(")(())())()()()"));
    }
}
