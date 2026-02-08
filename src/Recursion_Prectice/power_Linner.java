package Recursion_Prectice;

import java.util.Scanner;

public class power_Linner {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
        System.out.println(power(a,b));
    }
//    public static int power(int a, int b){
//        if (b == 0) return 1;
//        int ans = a * power(a,b-1);
//        return ans;
//    }
    public static int power(int a, int b){
        if (b == 0) return 1;
        int ans = power(a,b/2);
        if (b % 2 == 0){
            return ans * ans;
        }
        else {
            return ans * ans * a;
        }


    }
}
