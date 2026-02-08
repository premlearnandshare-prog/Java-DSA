package BasicsOfLoop;

import java.util.Scanner;

public class print_GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of term");
        int n = sc.nextInt();
        System.out.println("Enter first term");
        int a = sc.nextInt();
        System.out.println("Enter common ratio");
        int r = sc.nextInt();
       for (int i = 1; i <= n; i++) {
           System.out.print(a+" ");
           a*=r;
       }
    }
}
