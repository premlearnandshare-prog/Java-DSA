package Recursion_Prectice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_Subset_Of_String {
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String s = "abc";
        String ans = "";
        subset(0,s,ans);
        System.out.println(arr);
    }
    public static void subset(int i, String s,String ans){
        if (i == s.length()) {
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        subset(i + 1, s,ans + ch);
        subset(i + 1, s,ans);
    }
}
