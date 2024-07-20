public class Easy1074 {

    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        String a = s.substring(0, mid);
        String b = s.substring(mid, s.length());

        int countA = 0, countB = 0, i = 0;

        while (i < mid) {

            if (isVowelInString(String.valueOf(a.charAt(i)))) {
                countA += 1;
            }
            if (isVowelInString(String.valueOf(b.charAt(i)))) {
                countB += 1;
            }
            i++;
        }

        return countA == countB;

    }

    public boolean isVowelInString(String a) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        for (char v : vowels) {
            if (a.equalsIgnoreCase(String.valueOf(v))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Easy1074 easy1074 = new Easy1074();
        System.out.println(easy1074.halvesAreAlike("textbook"));
        System.out.println(easy1074.halvesAreAlike("book"));
    }
}
