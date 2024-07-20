import java.util.*;
import java.util.stream.Collectors;

public class Easy217 {
    public boolean containsDuplicate(int[] nums) {
        List<Integer> values = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> list = new HashSet<>(values);
        if(nums.length == list.size()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Easy217 easy217 = new Easy217();
        int[] nums = {1,2,3,4,1};
        System.out.println(easy217.containsDuplicate(nums));
    }
}
