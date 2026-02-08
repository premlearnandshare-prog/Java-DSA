package Recursion_Prectice;

public class Binary_String_without_Consecutive_Ones{
   public static void main(String[] args){
       int n = 3;
       String s = "";
       print(s,n);
   }
   public static void print(String s,int n){
        if (s.length() == n){ // Base case
            System.out.println(s);
            return;
        }
       int m = s.length();
        if(m == 0 || s.charAt(m - 1) == '0'){
            print(s + 0,n);
            print(s + 1,n);
        }
        else { //  s.charAt(m - 1) == '1'
            print(s + 0,n);
        }

   }
}
