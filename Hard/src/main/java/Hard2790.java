import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hard2790 {

    public int maxIncreasingGroups(List<Integer> usageLimits) {

        Collections.sort(usageLimits);

        long sum = 0;
        int ans = 0;

        for(int i = 0;i<usageLimits.size();i++){
            sum += usageLimits.get(i);
            if(sum>= ((ans+1)*(ans+2)) / 2) {
                ans++;
            }
        }

        return ans;

    }


    public static void main(String[] args) {

        Hard2790 hard2790 = new Hard2790();
        Integer[] arr = {1,4};
        List<Integer> list = Arrays.asList(arr);

        System.out.println(hard2790.maxIncreasingGroups(list));
    }
}
