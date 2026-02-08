package Two_Dimansional_Arrays;
public class Transform_into_Transpose {
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
         int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
         print(arr);
         // transpose
        // Logics
        // star trangle ki condition lagao
        // !1!    2    3
        // !4!   !5!   6
        // !7!   !8!   !9!
        // swap only !n! number and !_! pattern is trangle pattern
        // star trangle condition for(i = 0 to m)
        //                         for (j = 0 to i)
         int m = arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);

    }
}
