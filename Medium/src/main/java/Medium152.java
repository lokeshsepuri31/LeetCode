
public class Medium152 {

	public static int maxProduct(int[] nums) {

		int maxProd = Integer.MIN_VALUE;
		int prefix = 1;
		int suffix = 1;
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			if (prefix == 0)
				prefix = 1;
			if (suffix == 0)
				suffix = 1;

			prefix *= nums[i];
			suffix *= nums[n - i - 1];
			maxProd = Math.max(maxProd, Math.max(prefix, suffix));
		}

		return maxProd;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, -2, 4 };
		int arr1[] = { -2, 0, -1 };

		System.out.println(maxProduct(arr));
	}

}
