package Pattern_Printing.Special_Pattern;

import java.util.Scanner;

public class Star_Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// n is odd
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Border condition
                if (i==(n+2)/2 || j==(n+2)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // andar space
                }
            }
            System.out.println();
        }
    }

}
