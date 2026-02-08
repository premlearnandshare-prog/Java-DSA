package Two_Dimansional_Arrays;
import java.util.Scanner;
public class Min_In_Two_D_Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int m = sc.nextInt();
        System.out.print("Enter cols no. : ");
        int n = sc.nextInt();
        int[][]arr = new int[m][n];
        m = arr.length;
        n = arr[0].length;
        System.out.println("Enter element: ");
        // Input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int mn = Integer.MAX_VALUE;
        //Output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
//                if (mn > arr[i][j]){
//                    mn = arr[i][j];
//                }
                mn = Math.min(mn,arr[i][j]);
            }
        }
        System.out.println("The Maximum Value is " + mn);
    }
}
