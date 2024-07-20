public class Easy680 {

    public boolean validPalindrome(String s) {

        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
            i++;
            j--;
        }
        return true;
    }


    private boolean isPalindrome(String palindrome, int start, int end) {

        while (start < end) {
            if (palindrome.charAt(start) != palindrome.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Easy680 easy680 = new Easy680();
        System.out.println(easy680.validPalindrome("abcda"));

    }
}
