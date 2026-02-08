package String_Prem_Prectice;
import java.util.Scanner;
public class count_vowels_In_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        // Travel in array
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Isvowels(ch) == true){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean Isvowels (char ch){
         if (ch == 'A' || ch == 'a') return true;
        if (ch == 'E' || ch == 'e') return true;
        if (ch == 'I' || ch == 'i') return true;
        if (ch == 'O' || ch == 'o') return true;
        if (ch == 'U' || ch == 'u') return true;
        else return false;
    }
}
