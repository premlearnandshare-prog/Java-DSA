package Two_Dimansional_Arrays;

import java.util.ArrayList;

public class Spiral_From_Print {
    public static void print (int[][]arr){
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void main(String[] args){
            int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
            print(arr);
            int m = arr.length, n = arr[0].length;

            // spiral print
            int min_Row = 0, min_Cols = 0;
            int max_Row = m-1, max_Cols = n-1;
            while (min_Row <= max_Row && min_Cols <= max_Cols){
                // Left to Right
                for (int j = min_Cols; j <= max_Cols; j++) {
                    System.out.print(arr[min_Row][j] + " ");
                }
                min_Row++;
                // top to bottom
                if (min_Row>max_Row || min_Cols > max_Cols) break;
                for (int i = min_Row; i <= max_Row; i++) {
                    System.out.print(arr[i][max_Cols] + " ");
                }
                max_Cols--;
                // Right to Left
                if (min_Row>max_Row || min_Cols > max_Cols) break;
                for (int j = max_Cols; j >= min_Cols; j--) {
                    System.out.print(arr[max_Row][j] + " ");
                }
                max_Row--;
                //bottom to top
                if (min_Row>max_Row || min_Cols > max_Cols) break;
                for (int i = max_Row; i >= min_Row; i--) {
                    System.out.print(arr[i][min_Cols] + " ");
                }
                min_Cols++;
            }

    }
}
