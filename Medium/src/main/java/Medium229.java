import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Medium229 {

    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0, count2 = 0, element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;

        List<Integer> ans = new ArrayList();

        int majority = (nums.length / 3);

        for (int i : nums) {
            if (count1 == 0 && i != element2) {
                element1 = i;
                count1 = 1;
            } else if (count2 == 0 && i != element1) {
                element2 = i;
                count2 = 1;
            } else if (element1 == i) count1++;
            else if (element2 == i) count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i : nums) {
            if (element2 == i) count2++;
            if (element1 == i) count1++;
        }

        if (count1 > majority) ans.add(element1);
        if (count2 > majority) ans.add(element2);

        return ans;
    }

    public static void main(String[] args) {
        Medium229 medium229 = new Medium229();
        int[] nums = {1, 2};
        System.out.println(medium229.majorityElement(nums));
    }
}
