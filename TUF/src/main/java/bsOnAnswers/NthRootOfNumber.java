package bsOnAnswers;

public class NthRootOfNumber {

	public static int sqrt(int n, int m) {
		int low = 1, high = m;
		// Binary search on the answers:
		while (low <= high) {
			long mid = (low + high) / 2;
			long val = 1;
			for (int i = 0; i < n; i++)
				val *= mid;
			if (val < (long) (m)) {
				// eliminate the left half:
				low = (int) (mid + 1);
			} else if (val == (long) m) {
				return (int) mid;
			} else {
				// eliminate the right half:
				high = (int) (mid - 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(sqrt(3, 27));
	}

}
