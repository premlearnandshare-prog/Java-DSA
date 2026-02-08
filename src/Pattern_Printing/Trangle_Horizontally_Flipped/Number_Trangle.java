package Pattern_Printing.Trangle_Horizontally_Flipped;
import java.util.Scanner;
public class Number_Trangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1; i <= n ; i++) {
            for (int j=1; j<= n-1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
                                      // 1 2 3 4 5
                                      // 1 2 3 4
                                      // 1 2 3
                                       //1 2
                                       //1
        }

    }
}
