import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hard2251 {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {

        int[] ans = new int[people.length];

        for (int i = 0; i < people.length; i++) {
            for (int[] flower : flowers) {
                if (flower[0] <= people[i] && flower[1] >= people[i]) {
                    ans[i]++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Hard2251 hard2251 = new Hard2251();
        int[][] flowers = {{1, 10}, {3, 3}};
        int[] people = {3, 3, 2};
        System.out.println(Arrays.toString(hard2251.fullBloomFlowers(flowers, people)));
    }
}
