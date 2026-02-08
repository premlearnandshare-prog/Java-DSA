package Recursion;

import java.util.Scanner;

public class Binary_string_without_Consecutive_Ones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         String s = "";
        print(s,n);
    }
    public static void print(String s,int n){
        if (s.length() == n){ // Base case
            System.out.println(s);
            return;
        }
        int m = s.length();
        if (m == 0 || s.charAt(m - 1) == '0'){
            print(s + 0,n);
            print(s + 1,n);
        }
        else { // s.charAt(m - 1) == 1
            print(s + 0,n);
        }
    }
}
