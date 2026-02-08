package Pattern_Printing.Trangle;
import java.util.Scanner;
public class Star_Trangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 0; i <= n ; i++) {
            for (int j=0; j<= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
