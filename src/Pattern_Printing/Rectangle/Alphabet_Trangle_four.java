package Pattern_Printing.Rectangle;

import java.util.Scanner;

public class Alphabet_Trangle_four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j=1; j<= i; j++){
                System.out.print((char)(i+64) +" ");
            }
            System.out.println();
            // A
            // B B
            // C C C
            // D D D D

        }




    }
}
