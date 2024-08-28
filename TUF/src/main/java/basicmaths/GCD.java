package basicmaths;

public class GCD {

    public static int findGCD(int n1, int n2) {
        if (n1 == 0)
            return n2;
        else if (n2 == 0)
            return n1;

        if (n1 > n2) {
            return findGCD(n1 % n2, n2);
        } else {
            return findGCD(n2 % n1, n1);
        }
    }

    public static void main(String[] args) {
        System.out.println(findGCD(40, 42));
    }

}
