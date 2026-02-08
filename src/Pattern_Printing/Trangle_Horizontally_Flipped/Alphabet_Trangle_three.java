package Pattern_Printing.Trangle_Horizontally_Flipped;
import java.util.Scanner;
public class Alphabet_Trangle_three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n ; i++) {
            for (int j=1; j<= n-1-i; j++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();
            // a a a a a
            // b b b b
            // c c c
            // d d
            //e

        }

    }
}
