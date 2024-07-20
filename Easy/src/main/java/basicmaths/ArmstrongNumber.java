package basicmaths;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int num) {
        int size = String.valueOf(num).length();

        int sum = 0;
        int n = num;

        while(n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem,size);
            n /= 10;
        }

        return sum == num ? true : false;

    }

    public static void main(String[] args) {
        int num = 153;
        System.out.printf("Is %d, is an ArmstrongNumber: %b.", num, isArmstrongNumber(num));
    }
}
