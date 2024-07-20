public class Medium81 {

    public boolean search(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Medium81 medium81 = new Medium81();
        int[] nums = {2,5,6,0,0,1,2};
        System.out.println(medium81.search(nums,3));
    }
}
