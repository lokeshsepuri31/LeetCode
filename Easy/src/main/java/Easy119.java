import java.util.ArrayList;
import java.util.List;

public class Easy119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        int ans = 1;
        rowIndex +=1;
        row.add(ans);
        for (int i = 1; i < rowIndex; i++) {
            ans *= (rowIndex - i);
            ans /= i;
            row.add(ans);
        }
        return row;
    }

    public static void main(String[] args) {

        Easy119 easy119 = new Easy119();
        System.out.println(easy119.getRow(6));

    }
}
