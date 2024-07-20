import java.util.Stack;

public class Medium456 {

    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Medium456 medium456= new Medium456();
        int[] nums = {5,10,7,2,1,11,12,13};
        System.out.println(medium456.find132pattern(nums));
    }
}
