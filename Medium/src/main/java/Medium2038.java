public class Medium2038 {

    public boolean winnerOfGame(String colors) {

        int indexA = 0, indexB = 0;

        StringBuilder game = new StringBuilder(colors);

        while (true) {
            int index = move(game, indexA, 'A');
            if (indexA == index) {
                return false;
            } else {
                indexA = index;
            }
            index = move(game, indexB, 'B');
            if (indexB == index) {
                return true;
            } else {
                indexB = index;
            }
        }
    }

    private int move(StringBuilder game, int index, char move) {

        int i = index;

        while (i < game.length() - 3) {
            if (game.charAt(i) == move && game.charAt(i + 1) == move && game.charAt(i + 2) == move) {
                game.replace(i + 1, i + 2, "");
                return i + 1;
            }
            i++;
        }
        return index;
    }

    public static void main(String[] args) {
        Medium2038 medium2038 = new Medium2038();
        String s = "ABBBBBBBAAA";
        System.out.println(medium2038.winnerOfGame(s));
    }
}
