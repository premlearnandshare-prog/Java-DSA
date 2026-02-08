package Recursion_Prectice;

public class String_Travel_Using_Recursion {
    public static void main(String[] args){
         String s = "Prem Kumar";
      print(0,s);
    }
    public static void print(int i, String s){
        if (i >= s.length()) {
            return;
        }
        System.out.print(s.charAt(i));
        print(i + 1,s);
    }
}
