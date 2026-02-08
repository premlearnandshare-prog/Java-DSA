package BasicsOfLoop;

import java.util.Scanner;

public class print_the_name_ten_times_using_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
//        //this is very bad code
//        System.out.println("Prem kumar");
//        System.out.println("Prem kumar");
//        System.out.println("Prem kumar");
//        System.out.println("Prem kumar");
//        System.out.println("Prem kumar");
//        System.out.println("Prem kumar");
//        System.out.println("Prem kumar");
//        System.out.println("Prem kumar");
//        System.out.println("Prem kumar");
//        System.out.println("Prem kumar");
        // using for Loop
        for (int i = 1; i <= n; i++) {
            System.out.println("Prem kumar");
            System.out.println(i);
        }
        // that is valid code
//        int i;
//        for (i = 1; i <= n; i++) {
//            System.out.println("Prem kumar");
//            System.out.println(i);
//        }

    }
}
