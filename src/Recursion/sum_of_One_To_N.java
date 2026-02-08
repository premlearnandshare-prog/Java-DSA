package Recursion;

import java.util.Scanner;

public class sum_of_One_To_N {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         print(n,0);
    }
    public static void print(int n, int sum){
         if (n == 0){
             System.out.println(sum);
             return;
         }
         print(n-1,sum + n);  // call & work
    }
}
