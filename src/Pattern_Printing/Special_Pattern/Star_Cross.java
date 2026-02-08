package Pattern_Printing.Special_Pattern;

import java.util.Scanner;

public class Star_Cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// n is odd
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Border condition
                if (i==j || i+j==n+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // andar space
                }
            }
            System.out.println();
        }
    }

}
