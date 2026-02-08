package Pattern_Printing.Special_Trangle;

import java.util.Scanner;

public class Alphebet_Trangle_Vertically_Flipped {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i; j++) {// space
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= i; j++) { // Star
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
