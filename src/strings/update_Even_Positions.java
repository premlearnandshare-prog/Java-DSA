package strings;
import java.util.*;
public class update_Even_Positions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         int n = s.length();
         String t = "";
        for (int i = 0; i < n; i++) {
            if (i%2 == 0){
                t += 'a';
            }
            else {
                t += s.charAt(i);
            }
        }
        s += t;
        System.out.println(s);
    }
}
