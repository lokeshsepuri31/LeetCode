public class Medium343 {

    public int integerBreak(int n) {

        int ans = 1;
        if(n == 2 || n == 3) {
            return n - 1;
        }

        while(n>4){
            n -= 3;
            ans *= 3;
        }
        return ans * n;

    }

    public static void main(String[] args) {
        Medium343 medium343 = new Medium343();
        System.out.println(medium343.integerBreak(10));
    }

}
