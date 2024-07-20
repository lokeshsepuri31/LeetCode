public class Easy896 {

    public boolean isMonotonic(int[] nums) {
        int i = 1;
        boolean flag = nums[0] >= nums[i] ? true : false;
        while (i < nums.length - 1) {
            if (flag){
                if(nums[i] < nums[i+1]){
                    return false;
                }
            }else{
                if(nums[i] > nums[i+1]){
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        Easy896 easy896 = new Easy896();
        System.out.println(easy896.isMonotonic(nums));
    }
}
