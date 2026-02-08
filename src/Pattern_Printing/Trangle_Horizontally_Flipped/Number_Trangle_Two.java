package Pattern_Printing.Trangle_Horizontally_Flipped;

import java.util.Scanner;

public class Number_Trangle_Two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n ; i++) {
            for (int j=1; j<= n-1-i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
                                      // 1 1 1 1 1 1
                                      // 2 2 2 2 2
                                      // 3 3 3 3
                                       // 4 4 4
                                        // 5 5
                                        //6
        }

    }
}
