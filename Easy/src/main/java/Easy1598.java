public class Easy1598 {

    public int minOperations(String[] logs) {
        int minOperations = 0;
        for (String log : logs) {
            if (log.equals("../") && minOperations > 0) {
                minOperations--;
            } else if (log.charAt(0) != '.') {
                minOperations++;
            }
        }

        return minOperations;
    }

    public static void main(String[] args) {
        String[] logs = {"d1/", "../", "../", "../"};
        Easy1598 easy1598 = new Easy1598();
        System.out.println(easy1598.minOperations(logs));
    }
}
