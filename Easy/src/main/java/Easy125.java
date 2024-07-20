public class Easy125 {

    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z]", "");
        if (result.length() == 0) {
            return true;
        }
        return result.length() % 2 != 0;
    }

    public static void main(String[] args) {
        Easy125 easy125 = new Easy125();
        String s = " ";
        System.out.println(easy125.isPalindrome(s));
    }

}
