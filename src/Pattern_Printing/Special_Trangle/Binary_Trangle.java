package Pattern_Printing.Special_Trangle;

import java.util.Scanner;

public class Binary_Trangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("0"+ " ");
                } else {
                    System.out.print("1"+" "); // andar space
                }
            }
            System.out.println();

        }
    }
}
