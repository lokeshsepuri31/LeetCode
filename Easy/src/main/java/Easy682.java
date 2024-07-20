import java.util.ArrayList;
import java.util.List;

public class Easy682 {

    public int calPoints(String[] operations) {

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            if (i > 0 && operations[i].equals("D")) {
                scores.add(scores.get(scores.size() - 1) * 2);
            } else if (i > 0 && operations[i].equals("C")) {
                scores.remove(scores.size() - 1);
            } else if (i > 0 && operations[i].equals("+")) {
                scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
            } else {
                scores.add(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;

        for (int x : scores) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        Easy682 easy682 = new Easy682();
        String[] operations = {"5", "2", "C", "D", "+"};
        System.out.println(easy682.calPoints(operations));
    }
}
