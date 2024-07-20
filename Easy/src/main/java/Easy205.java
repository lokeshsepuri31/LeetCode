import java.util.HashMap;
import java.util.Map;

public class Easy205 {

    public boolean isIsomorphic(String s, String t) {
        Map<String, String> mappingKeys = new HashMap<String, String>();
        Map<String, String> mappingValues = new HashMap<String, String>();
        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            String mappingValue = String.valueOf(t.charAt(i));
            String value = mappingKeys.get(key);
            String value1 = mappingValues.get(mappingValue);
            if (value == null && value1 == null) {
                mappingKeys.put(key, mappingValue);
                mappingValues.put(mappingValue,key);
            } else if (!value1.equals(key)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Easy205 easy205 = new Easy205();
        System.out.println(easy205.isIsomorphic("badc", "baba"));
        System.out.println(easy205.isIsomorphic("foo","bar"));
        System.out.println(easy205.isIsomorphic("paper", "title"));
        System.out.println(easy205.isIsomorphic("egg", "add"));
    }
}
