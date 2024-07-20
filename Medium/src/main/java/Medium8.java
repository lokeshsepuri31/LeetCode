public class Medium8 {

    public int myAtoi(String s) {
        int ans = 0;
        char sign = '+';
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                ans += Integer.parseInt(String.valueOf(s.charAt(i)));
                ans *=10;
            } else if (s.charAt(i) == '-') {
                sign = s.charAt(i);
            }
        }
        ans /= 10;
        if(sign == '-'){
            ans *= -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Medium8 medium8 = new Medium8();
        String s = "words in 987";
        System.out.println(medium8.myAtoi(s));
    }

}
