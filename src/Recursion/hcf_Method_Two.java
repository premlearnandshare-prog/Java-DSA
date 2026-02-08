package Recursion;

import java.util.Scanner;

public class hcf_Method_Two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int y = sc.nextInt();
        int h = hcf(x, y);          // recursive HCF
        int lcm = (x * y) / h;      // formula --> lcm * hcf = x * y
        System.out.println("hcf is " + h);
        System.out.println("LCM is " + lcm);
    }
    public static int hcf(int x, int y){
        // iterative
         while (x % y != 0){
             int rem = x % y;
             x = y;
             y = rem;
         }
         return y;
    }
    public static int hcf2 (int x, int y){
         if (y == 0) return x;
         int ans = hcf2(y,x % y);
         return ans;
    }
 }
