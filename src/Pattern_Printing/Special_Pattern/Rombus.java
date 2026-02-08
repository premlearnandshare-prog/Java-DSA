package Pattern_Printing.Special_Pattern;
import java.util.Scanner;
public class Rombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {// space
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= n; j++) { // Star
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
