package Recursion;

import java.util.Scanner;

public class skip_character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         String ans = "";
         print(0,s,ans);
    }
    public static void print(int i, String s, String ans){
         if (i >= s.length()) {
             System.out.println(ans);
             return;
         }
         if (s.charAt(i) != 'a') ans += s.charAt(i);
         print(i + 1,s,ans);
    }
}
