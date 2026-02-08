package strings;
import java.util.Scanner;
public class Print_All_The_Substring {
    public static void main(String[] args){
         // Question ==> input a string and print all the substring of that string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        substring a,ab,abc,abcd,b,bc,bcd,c,cd,d
//         a
//         a b          b
//         a b c        b c       c
//         a b c d      b c d     c d         d
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.print(s.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}
