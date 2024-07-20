import java.util.HashSet;
import java.util.Set;

public class Medium287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        int sum1 = sum(nums);
//        int sum2 = sum(arr);
        int sum2 = 0;
        return sum1-sum2;
    }

    private int sum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
