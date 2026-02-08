package Pattern_Printing.Rectangle;

import java.util.Scanner;

public class Number_Trangle_two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
}   }
                                          // 1
                                         // 2 2
                                         // 3 3 3
                                         // 4 4 4 4