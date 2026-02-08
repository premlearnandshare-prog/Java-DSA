package Two_Dimansional_Arrays;

public class set_Matrix_Zeroes_Method_One {
    public static void main(String[] args){
         int[][] matrix = {{1 ,1 ,1 },
                           {1 ,0 ,1 },
                           {1 ,1 ,1 }
         };
         int m = matrix.length;
         int n = matrix[0].length;

        setZeroes(matrix); // --> function call

        //print final matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        // step 1 ==> copy banana
        int[][] copy = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = matrix[i][j];
            }
        }

        // step 2 : Original matrix me 0 dhundo --> travel karo
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    // row ko zero karo
                    for (int cols = 0; cols < n; cols++) {
                        copy[i][cols] = 0;
                    }
                    // cols ko zero karo
                    for (int row = 0; row < m; row++) {
                        copy[row][j] = 0;
                    }

                }
            }
        }
        // step 3 : copy wale ko vapas original me daal do
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = copy[i][j];
            }
        }
    }
}
