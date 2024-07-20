import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medium73 {

    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int col = matrix[0].length;
        List<List<Integer>> zeros = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> zero = new ArrayList<>();
                    zero.add(i);
                    zero.add(j);
                    zeros.add(zero);
                }
            }
        }

        for(List<Integer> zero: zeros){
            setRowsZero(matrix,zero.get(0));
            setColsZero(matrix,zero.get(1));
        }


    }

    public void setRowsZero(int[][] matrix, int row){
        for(int i =0;i<matrix[0].length;i++){
            matrix[row][i] = 0;
        }
    }

    public void setColsZero(int[][] matrix, int col){
        for(int j = 0;j<matrix.length;j++){
            matrix[j][col] = 0;
        }
    }

    public static void main(String[] args) {
        Medium73 medium73 = new Medium73();
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        medium73.setZeroes(matrix);

        System.out.println(Arrays.toString(matrix));

    }
}
