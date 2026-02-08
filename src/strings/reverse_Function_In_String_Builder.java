package strings;
import java.util.Scanner;
public class reverse_Function_In_String_Builder {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.reverse();
        System.out.println(sb);
    }
}
