package Basics_Of_Java;

import java.util.Scanner;

public class permanent_AP_code_format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // code for any AP
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the first number of AP");
        int a = sc.nextInt();
        System.out.println("Enter d of AP");
        int d = sc.nextInt();
       for (int i = 1; i <= n; i++) {
           System.out.print(a+" ");
           a+=d;
       }
    }
}
