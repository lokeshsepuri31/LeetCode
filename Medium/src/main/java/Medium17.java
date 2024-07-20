import java.util.*;

public class Medium17 {

    public List<String> letterCombinations(String digits) {
        Map<String, String> letters = new HashMap<>();
        letters.put("2", "abc");
        letters.put("3", "def");
        letters.put("4", "ghi");
        letters.put("5", "jkl");
        letters.put("6", "mno");
        letters.put("7", "pqrs");
        letters.put("8", "tuv");
        letters.put("9", "wxyz");

        List<String> A = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            String letter = letters.get(String.valueOf(digits.charAt(i)));
            for (int j = 0; j < letter.length(); j++)
                A.add(String.valueOf(letter.charAt(j)));
        }

        List<String> ans = new ArrayList<>();
        findCombinations(A, 0, digits.length(), ans, new ArrayList<String>());

        return ans;
    }

    public void findCombinations(List<String> A, int i, int k, List<String> subarrays, List<String> out) {
        if (A.size() == 0 || k > A.size()) {
            return;
        }

        if (k == 0) {
            String l = "";
            for (String letter : out)
                l += letter;
            subarrays.add(l);
            return;
        }

        for (int j = i; j < A.size(); j++) {
            out.add(A.get(j));
            findCombinations(A, j + 1, k - 1, subarrays, out);
            out.remove(out.size() - 1);
        }
    }

    public static void main(String[] args) {
        Medium17 medium17 = new Medium17();
//        System.out.println(medium17.letterCombinations("23"));
        System.out.println(medium17.letterCombinations("729"));
    }
}
