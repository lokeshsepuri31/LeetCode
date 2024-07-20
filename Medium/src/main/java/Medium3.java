import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Medium3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> subSet = new HashSet();
        for(int i = 0; i<s.length();i++){
            subSet.add(s.charAt(i));
        }

        return subSet.size();
    }

    public static void main(String[] args) {
        Medium3 medium3 = new Medium3();
        System.out.println(medium3.lengthOfLongestSubstring("abcabcbb"));
    }
}
