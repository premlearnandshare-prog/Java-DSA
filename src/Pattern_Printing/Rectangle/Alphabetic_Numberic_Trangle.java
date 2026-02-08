package Pattern_Printing.Rectangle;
import java.util.Scanner;
public class Alphabetic_Numberic_Trangle {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
     int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1;j<=i;j++){
                if(i%2!=0){
                    System.out.println(j+" ");
                }
                else {
                    System.out.println((char) (j+64)+ " ");
                }
            }
            System.out.println();
        }
    }
}
