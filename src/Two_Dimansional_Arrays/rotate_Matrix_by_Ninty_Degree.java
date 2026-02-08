package Two_Dimansional_Arrays;
public class rotate_Matrix_by_Ninty_Degree {
    public static void main(String[] args){
         int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
         print(arr);
         int m = arr.length;
         // transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
        //Rotate --> Reverse each row
        for (int i = 0; i < m; i++) {
            int low = 0, hi = m-1;
            while (low<hi){
                // swap arr [i][low] and arr[i][hi]
                int temp = arr [i][low];
                arr [i][low] = arr[i][hi];
                arr[i][hi] = temp;
                low++;
                hi--;
            }
        }
        print(arr);

    }
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

}
