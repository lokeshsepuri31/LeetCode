public class Medium880 {

    public String decodeAtIndex(String s, int k) {
        long size = 0;

        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                size *= Integer.parseInt(""+ch);
            }else{
                size++;
            }
        }

        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            k %= size;
            if(k ==0 && !Character.isDigit(ch)){
                return ""+ch;
            }

            if(Character.isDigit(ch)){
                size /= Integer.parseInt(""+ch);
            }else{
                size--;
            }
        }

        return "";
    }


    public static void main(String[] args) {
        Medium880 medium880 = new Medium880();
        String s = "a2345678999999999999999";
        int k = 1;
        System.out.println(medium880.decodeAtIndex(s, k));
    }

}
