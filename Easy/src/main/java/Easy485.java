public class Easy485 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int count = 0;

        for(int i=0; i< nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                max_count = Math.max(max_count, count);
                count = 0;
            }
        }

        return Math.max(max_count, count);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
