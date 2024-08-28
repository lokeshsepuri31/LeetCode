package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {

    public static List<Integer> leaderInArray(int[] arr) {
        int n = arr.length;
        int leader = arr[n - 1];
        List<Integer> list = new ArrayList<>();
        list.add(leader);
        for (int i = n - 2; i >= 0; i--) {
            if(leader < arr[i]) {
                leader = arr[i];
                list.add(leader);
            }
        }

        Collections.reverse(list);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        leaderInArray(arr).stream().forEach(System.out::println);
    }
}
