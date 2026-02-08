package String_Prem_Prectice;
import java.util.Scanner;
public class Reverse_String_Builder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
         StringBuilder sb = new StringBuilder(s);
//         // method 1 --> using Builtin function
//         sb.reverse();
//        System.out.println(sb);

        // using loops
        int i = 0, j  = sb.length() - 1;
        while (i<j){
            // swap --> i,j
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
