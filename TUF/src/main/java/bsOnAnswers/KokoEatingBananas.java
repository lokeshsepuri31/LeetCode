package bsOnAnswers;

public class KokoEatingBananas {

	public static int minEatingSpeed(int[] piles, int h) {

		int high = max(piles);
		int low = 1;

		if (piles.length == h)
			return high;

		while (low <= high) {
			int mid = (low + high) / 2;
			int totalHrs = findTotalHours(mid, piles);

			if (totalHrs > h) {
				low = mid + 1;
			} else if (totalHrs <= h) {
				high = mid - 1;
			}
		}

		return low;

	}

	private static int max(int[] piles) {
		int max = 0;
		for (int i : piles) {
			max = Math.max(max, i);
		}

		return max;
	}

	public static int findTotalHours(double k, int[] piles) {
		int sumHrs = 0;
		for (int i : piles) {
			sumHrs += Math.ceil((double) (i) / (double) (k));
		}

		return sumHrs;
	}

	public static void main(String[] args) {
		int[] piles = { 30, 11, 23, 4, 20 };
		int h = 6;
		System.out.println(minEatingSpeed(piles, h));
	}
}
