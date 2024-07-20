import java.util.HashMap;
import java.util.Map;

public class Medium12 {

    public String intToRoman(int num) {
        Map<Integer, String> intToRoman = new HashMap<>();
        intToRoman.put(1, "I");
        intToRoman.put(4, "IV");
        intToRoman.put(5, "V");
        intToRoman.put(9, "IX");
        intToRoman.put(10, "X");
        intToRoman.put(40, "XL");
        intToRoman.put(50, "L");
        intToRoman.put(90, "XC");
        intToRoman.put(100, "C");
        intToRoman.put(400, "CD");
        intToRoman.put(500, "D");
        intToRoman.put(900, "CM");
        intToRoman.put(1000, "M");
        String result = "";

        while (num > 0) {
            int divisor = 0;
            if (num > 1000)
                divisor = 1000;
            else if (num > 100) {
                divisor = 100;
            } else if (num > 10) {
                divisor = 10;
            } else
                divisor = 1;
            int quotient = (num / divisor) * divisor;
            if (intToRoman.get(quotient) == null) {
                int numberofTimes = 0;
                String roman = "";
                if (quotient > 1000) {
                    numberofTimes = quotient / 1000;
                    roman = "M";
                } else if (quotient > 500) {
                    numberofTimes = (quotient - 500) / 100;
                    result += ("D");
                    roman = "C";
                } else if (quotient > 100) {
                    numberofTimes = quotient / 100;
                    roman = "C";
                } else if (quotient > 50) {
                    numberofTimes = (quotient - 50) / 10;
                    result += ("L");
                    roman = "X";
                } else if (quotient > 10) {
                    numberofTimes = quotient / 10;
                    roman = "X";
                } else if (quotient > 5) {
                    numberofTimes = (quotient - 5);
                    result += ("V");
                    roman = "I";
                } else {
                    numberofTimes = quotient;
                    roman = "I";
                }
                result = addRomans(result, numberofTimes, roman);
            } else {
                result += (intToRoman.get(quotient));
            }
            num %= divisor;
        }
        return result;
    }

    public String addRomans(String result, int numberOfTimes, String roman) {
        while (numberOfTimes > 0) {
            result += (roman);
            numberOfTimes--;
        }
        return result;
    }

    public static void main(String[] args) {
        Medium12 medium12 = new Medium12();
//        System.out.println(medium12.intToRoman(1994));
//        System.out.println(medium12.intToRoman(2004));
        System.out.println(medium12.intToRoman(884));
    }
}
