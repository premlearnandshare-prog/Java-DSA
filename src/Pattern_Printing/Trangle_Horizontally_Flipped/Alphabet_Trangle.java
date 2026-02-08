package Pattern_Printing.Trangle_Horizontally_Flipped;

import java.util.Scanner;

public class Alphabet_Trangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n ; i++) {
            for (int j=1; j<= n-1-i; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
                                                    // A B C D E
                                                    // A B C D
                                                    // A B C
                                                     //A B
                                                     //A
        }

    }
}

