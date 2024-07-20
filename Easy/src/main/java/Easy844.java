public class Easy844 {

    public String getActualString(String str) {
        StringBuilder sb = new StringBuilder();
        for(char x: str.toCharArray()) {
            if(x == '#') {
                if(sb.length() == 0) {
                    sb.deleteCharAt(sb.length()-1);
                }
            } else {
                sb.append(x);
            }
        }
        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return getActualString(s)
                .equals(getActualString(t));
    }

    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        Easy844 easy844 = new Easy844();
        System.out.println(easy844.backspaceCompare(s, t));
    }
}
