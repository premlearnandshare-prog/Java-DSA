package BasicsOfLoop;

import java.util.Scanner;

public class Print_the_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        // print --> 1,3,5,7,9,11 .......... (2n-1)
       // method 1
        for (int i = 1; i <=(2*n-1) ; i+=2) {
            System.out.print(i+" ");
//             an= a+ (n-1)d
//             an = 1+ (n-1)*2
//             an = 1+ 2n-2
//            an = 2n-1
        }
    }
}
