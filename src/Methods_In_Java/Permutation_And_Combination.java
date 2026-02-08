package Methods_In_Java;
import java.util.Scanner;
public class Permutation_And_Combination {
    // Take n and r as input and print nPr nCr
    // nPr =  n!/(n-r)!
    //nCr =  n!/r!*(n-r)!

        public static void main(String[] arg){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter r: ");
            int r = sc.nextInt();
            int nCr = Fact(n) / (Fact(r) * Fact(n - r));
            int nPr = Fact(n) /  Fact(n - r);
            System.out.println(nCr);
            System.out.println(nPr);
        }
    public static int Fact(int x) {
        int f = 1;
        for (int i = 1; i < x; i++) {
            f *= i;
        }
        return f;
    }
}
