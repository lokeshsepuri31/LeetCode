import java.util.HashMap;
import java.util.Map;

public class Easy914 {

    public boolean hasGroupsSizeX(int[] deck) {
        int k = 0;
        return hasGroupsSizeX(deck, new HashMap<Integer, Integer>(), k);
    }

    private boolean hasGroupsSizeX(int[] deck, Map<Integer, Integer> map, int k) {

        if (k == deck.length) {
            int i = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (i != 0 && entry.getValue() % 2 != 0) {
                    if(entry.getValue() != i){
                        return false;
                    }
                }
                i = entry.getValue();
            }
            if (i == 1) {
                return false;
            }
            return true;
        }

        if (map.get(deck[k]) == null) {
            map.put(deck[k], 1);
        } else {
            map.put(deck[k], map.get(deck[k]) + 1);
        }
        return hasGroupsSizeX(deck, map, k + 1);
    }

    public static void main(String[] args) {
        Easy914 easy914 = new Easy914();
        int[] deck = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] deck1 = {1, 1, 1, 2, 2, 2, 3, 3};
        int[] deck2 = {0, 0, 0, 1, 1, 1, 2, 2, 2};
        int[] deck3 = {1,1,2,2,2,2};
        System.out.println(easy914.hasGroupsSizeX(deck1));
    }
}
