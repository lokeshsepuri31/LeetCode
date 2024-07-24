package tuf;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumZero {

	public static int longestSubarray(int[] nums, int n) {
		int maxLen = 0;
		int preFixSum = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			preFixSum += nums[i];
			if (preFixSum == 0) {
				maxLen = i + 1;
			} else if (map.containsKey(preFixSum)) {
				maxLen = Math.max(maxLen, i - map.get(preFixSum));
			} else {
				map.put(preFixSum, i);
			}
		}

		return maxLen;
	}
	
	public static void main(String[] args) {
		int[] nums = {-2,0,2,1};
		System.out.println(longestSubarray(nums, nums.length));
		
	}

}
