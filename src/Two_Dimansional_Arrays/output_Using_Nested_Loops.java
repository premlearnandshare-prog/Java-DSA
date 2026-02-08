package Two_Dimansional_Arrays;
import java.util.Scanner;
public class output_Using_Nested_Loops {
    public static void main(String[] args){
         int[][] matrix = new int[4][3];
         Scanner sc = new Scanner(System.in);
         int m = matrix.length;//no. of row or lines
        int n = matrix[0].length;// no. of cols
        System.out.println(m);
        System.out.println(n);
         //Loops
        // Input of 2D Arrays
        for (int i = 0; i < m; i++) {// for rows
            for (int j = 0; j<n; j++){// for column
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output of 2D Arrays
        for (int i = 0; i < m; i++) {// for rows
            for (int j = 0; j<n; j++){// for column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
