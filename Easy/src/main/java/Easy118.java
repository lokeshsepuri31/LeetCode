import java.util.ArrayList;
import java.util.List;

public class Easy118 {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pascalsTriangle = new ArrayList<>();

		for (int i = 1; i <= numRows; i++) {
			List<Integer> row = new ArrayList<>();
			nthRowOfPascalsTriangle(row, i);
			pascalsTriangle.add(row);

		}
		return pascalsTriangle;
	}

	private void nthRowOfPascalsTriangle(List<Integer> row, int n) {
		int ans = 1;
		row.add(ans);
		for (int i = 1; i < n; i++) {
			ans *= (n - i);
			ans /= i;
			row.add(ans);
		}
	}

	private void nCr(int n, int r) {
		int res = 1;
		for (int i = 0; i < r; i++) {
			res *= n - i;
			res /= i + 1;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {

		Easy118 easy118 = new Easy118();
		System.out.println(easy118.generate(6));
		int row = 5, col = 3;
		int n = row - 1, r = col - 1;
		easy118.nCr(n, r);
	}

}
