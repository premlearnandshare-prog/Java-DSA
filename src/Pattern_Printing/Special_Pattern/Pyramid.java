package Pattern_Printing.Special_Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        // outer loop
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= nsp; j++) {// space
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= nst; j++) { // Star
                System.out.print("*" + " ");
            }
            nsp-=1;
            nst+=2;
            System.out.println();
        }
    }
}
