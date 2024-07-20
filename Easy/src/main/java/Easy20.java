public class Easy20 {

    public boolean isValid(String s) {

        String[] openBrackets = {"(", "{", "["};
        String[] closeBrackets = {")", "}", "]"};

        String[] ans = new String[s.length()];
        int i = 0, j = 1;
        int k = 0;

        while (j <= s.length()) {
            String bracket = s.substring(i, j);
            if (isOpenOrCloseBracket(openBrackets, bracket) != -1) {
                ans[k] = bracket;
                k++;
            } else {
                int index = isOpenOrCloseBracket(closeBrackets, bracket);
                if (k != 0 && ans[k - 1].equals(openBrackets[index])) {
                    ans[k - 1] = null;
                    k--;
                } else {
                    return false;
                }
            }
            i++;
            j++;
        }
        if (ans[0] == null) {
            return true;
        }

        return false;
    }

    public int isOpenOrCloseBracket(String[] brackets, String bracket) {
        for (int i = 0; i < brackets.length; i++) {
            if (brackets[i].equals(bracket)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Easy20 easy20 = new Easy20();
        System.out.println(easy20.isValid("({[]})"));
        System.out.println(easy20.isValid("({]})"));
        System.out.println(easy20.isValid("({[(})"));
        System.out.println(easy20.isValid("]"));
    }

}
