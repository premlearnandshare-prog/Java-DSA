package Two_Dimansional_Arrays;

public class Row_Wise_And_Cols_Wise_Print {
    public static void main(String[] args){
         //1 2
        // 3 4
        // 5 6
//        int arr[][] = {{1,2},{3,4},{5,6}};
//        int m = arr.length, n = arr[0].length;
//        for (int i = 0; i < m; i++) {// rows
//            for (int j = 0; j < n; j++) {//Cols
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//
//        }
        // cols Wise printing
        int arr[][] = {{1,2},{3,4},{5,6}};
        int m = arr.length, n = arr[0].length;
        for (int j = 0; j < n; j++){// rows
            for (int i = 0; i < m; i++){//Cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        //Storing in a new matrix
        int [][] transpose = new int[n][m];
        for (int i = 0; i < n; i++){// rows
            for (int j = 0; j < m; j++){//Cols
               transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();

        }
    }

}
