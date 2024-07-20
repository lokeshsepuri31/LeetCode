public class Medium48 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0;i<n;i++){
            reverse(matrix[i]);
        }

    }

    private void reverse(int[] arr){
        int p1 = 0, p2 = arr.length - 1;
        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;p2--;
        }
    }

    public static void main(String[] args) {
        Medium48 medium48 = new Medium48();
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        medium48.rotate(matrix);
//        for (int[] rows : matrix) {
//            for (int element : rows) {
//                System.out.print(element + " ");
//            }
//            System.out.println("");
//        }
    }

}
