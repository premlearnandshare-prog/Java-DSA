package Recursion_Prectice;

public class skip_character {
    public static void main(String[] args){
         String s = "Raghav garg";
         // input --> Raghav garg Output --> Rghv grg
        print(0,s);
    }
    public static void print(int i, String s){
        if (i >= s.length()) return;
        char ch = s.charAt(i);
        if (ch != 'a') System.out.print(s.charAt(i));
        print(i + 1,s);
    }
}
