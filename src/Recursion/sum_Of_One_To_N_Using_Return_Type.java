package Recursion;

import java.util.Scanner;

public class sum_Of_One_To_N_Using_Return_Type {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
      if (n == 0 || n == 1) { // base case
         return n;
      }
      return n + sum(n-1); // call

    }
}
