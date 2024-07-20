import java.util.*;

public class Medium15 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            for (int j = 0;j<nums.length;j++){
                if(j == i)
                    continue;
                for (int k=0;k<nums.length;k++){
                    if(j==k || i==k)
                        continue;
                    if(nums[i] + nums[k]+nums[j] == 0){
                        Integer[] a = {nums[i],nums[k],nums[j]};
                        List<Integer> result = new ArrayList<>(Arrays.asList(a));
                        if(!set.contains(result)){
                            set.add(result);
                            ans.add(result);
                        }
                    }
                }
            }
        }
        System.out.println(set);

        return ans;
    }

    public static void main(String[] args) {
        Medium15 medium15 = new Medium15();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(medium15.threeSum(nums));
    }
}
