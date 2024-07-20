import java.util.*;
public class Medium46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> subarray = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        combinations(nums,subarray, new ArrayList<>(),map);
        return subarray;
    }
    public void combinations(int[] arr,List<List<Integer>> subarray,List<Integer> out,boolean[] map){
        if(out.size() == arr.length){
            subarray.add(out);
            return;
        }

        for(int i = 0;i<arr.length;i++){
            if(!map[i]) {
                map[i] = true;
                out.add(arr[i]);
                combinations(arr, subarray, out,map);
                out.remove(out.size() - 1);
                map[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Medium46 medium44 = new Medium46();
        List<List<Integer>> list = medium44.permute(nums);
        System.out.println(list);
    }
}
