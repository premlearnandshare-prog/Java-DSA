package BasicsOfLoop;

import java.util.Scanner;

public class table_of_nineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
//        for(int i=1;i<=n;i++) {
//            if(i%19==0) {
//                System.out.println(i);
//            }
//    }
        // using if conditions
//        for(int i=19;i<=n;i++) {
//            if(i%19==0) {
//                System.out.println(i);
//            }
//
//        }
        // without if conditions
        for(int i=19;i<=190;i=i+19) {
            System.out.println(i);
        }
    }
}
