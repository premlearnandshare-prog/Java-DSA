package Pattern_Printing.Rectangle;

import java.util.Scanner;

public class Alphabet_Trangle_Two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n ; i++) {
            for (int j=1; j<= i; j++){
                System.out.print((char)(j+96) +" ");
            }
            System.out.println();
                                                 // a
                                                  // a b
                                                  // a b c
                                                   // a b c d

        }




    }
}
