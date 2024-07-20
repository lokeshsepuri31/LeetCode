public class Easy219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k <= 1 && nums.length == 1)
            return true;

        int i = 0;
        int j = k;
        if (j < nums.length) {
            while (i < nums.length) {
                if (j != i && nums[i] == nums[j] && (j - i) <= k) {
                    return true;
                }
                j--;
                if (j <= i) {
                    i++;
                    j = (i + k) < nums.length ? i + k : nums.length - 1;
                }
            }
        } else {
            return containsNearbyDuplicate(nums, (nums.length - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        Easy219 easy219 = new Easy219();
//        System.out.println(easy219.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
//        System.out.println(easy219.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 10));
//        System.out.println(easy219.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(easy219.containsNearbyDuplicate(new int[]{1}, 1));
    }
}
