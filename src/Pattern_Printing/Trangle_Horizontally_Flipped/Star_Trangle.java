package Pattern_Printing.Trangle_Horizontally_Flipped;

import java.util.Scanner;

public class Star_Trangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 0; i <= n ; i++) {
            for (int j=0; j<= n-1-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            //Logic =       i+j = n-1
            //               j = n-1-i
            //               i                 j
            // * * * * *     1                  5
            // * * * *       2                  4
            // * * *         3                  3
            // * *           4                  2
            // *             5                  1


        }
    // method 2
        int a = n;
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= a; j++) {
                System.out.print("*" + " ");
            }
            a--;
            System.out.println();
        }
    }
}
