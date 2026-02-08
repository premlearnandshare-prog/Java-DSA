package Recursion;

public class Permutation {
    public static void main(String[] args){
         String s = "abcdef";
         String ans = "";
         printPermutation(ans,s);
    }
    public static void printPermutation (String ans,String s){
        if (s.length() == 0){ // Base case
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i + 1);
            printPermutation (ans + ch,left + right);
        }
    }
}
