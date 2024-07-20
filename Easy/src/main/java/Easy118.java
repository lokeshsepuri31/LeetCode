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

    public static void main(String[] args) {

        Easy118 easy118 = new Easy118();
        System.out.println(easy118.generate(6));
    }

}
