package String_Prem_Prectice;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class palindrome_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // r a c e c a r
        int i = 0, j = s.length() -1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)){
                System.out.println("Not palindrome");
                break;
            }
            else {
                i++;
                j--;
            }
        }
    }
}
