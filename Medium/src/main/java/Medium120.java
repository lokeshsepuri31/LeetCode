import java.util.List;

public class Medium120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int ans = 0;
        for (List<Integer> list : triangle)
            ans += minimum(list, 0, list.size());
        return ans;
    }

    public int minimum(List<Integer> list, int start, int n) {
        int min;
        if (n - 1 == 0) {
            return list.get(start);
        }
        if (start >= n - 2) {
            if (list.get(start) <= list.get(start + 1))
                return list.get(start);
            else
                return list.get(start + 1);
        }
        min = minimum(list, start + 1, n);
        if (list.get(start) < min)
            return list.get(start);
        else
            return min;
    }

    public static void main(String[] args) {
        Medium120 medium120 = new Medium120();
        int[][] arr = {{-1}, {2, 3}, {1, -1, -3}};

        System.out.println();
    }
}
