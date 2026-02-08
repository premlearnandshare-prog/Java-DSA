package Two_Dimansional_Arrays;

import java.util.Scanner;

public class Max_In_Two_D_Arrays {
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
        int mx = Integer.MIN_VALUE;
        //Output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
//                if (mx < arr[i][j]){
//                    mx = arr[i][j];
//                }
                mx = Math.max(mx,arr[i][j]);
            }
        }
        System.out.println("The Maximum Value is " + mx);
    }
}
