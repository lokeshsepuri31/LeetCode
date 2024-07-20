package basicmaths;

import java.util.ArrayList;
import java.util.List;

public class FindAllDivisors {

    public static List<Integer> findAllDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if(n % i == 0) {
                divisors.add(i);
                if(i != n/i) {
                    divisors.add(n/i);
                }
            }
        }

        return divisors;
    }

    public static void main(String[] args) {
        findAllDivisors(36).stream().forEach(System.out::println);
    }
}
