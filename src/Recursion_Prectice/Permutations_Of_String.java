package Recursion_Prectice;

public class Permutations_Of_String {
    public static void main(String[] args){
         String s = "abc";
         String ans ="";
         print(s,ans);
    }
    public static void print(String s,String ans){
        if(s.length() == 0){ // Base case
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i + 1);
            print(right + left,ans + ch);
        }

    }
}
