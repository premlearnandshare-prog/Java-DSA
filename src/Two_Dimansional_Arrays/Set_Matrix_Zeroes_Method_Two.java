package Two_Dimansional_Arrays;

public class Set_Matrix_Zeroes_Method_Two {
    public static void main(String[] args){
        int[][] matrix = {{1 ,1 ,1 },
                          {1 ,0 ,1 },
                          {1 ,1 ,1 }
        };
        int m = matrix.length;
        int n = matrix[0].length;

        setZeroes(matrix);

        // print final matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][]matrix){
         int m = matrix.length; // no of rows
         int n = matrix[0].length; // no of cols

        boolean [] row = new boolean[m]; // row[i] true ka matlab poori row ko zero karna hai
        boolean [] cols = new boolean[n]; // col[j] true ka matlab poora column zero karna hai

//        boolean is by default false hota h
        // step 2 : matrix me 0 search karo // traveling

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    row[i] = true;  // mark this row
                    cols[j] = true; // mark this cols


                }
            }
        }
        // step 3:  Marked row aur column ko zero kar do
        for (int i = 0; i < m; i++) {
            if (row[i] == true){
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (cols[j] == true){
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
