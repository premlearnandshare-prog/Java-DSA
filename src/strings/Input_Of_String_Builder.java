package strings;
import java.util.Scanner;
public class Input_Of_String_Builder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder(sc.nextLine()); --> method 1
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s); // --> method 2
        System.out.println(sb);
        sb.setCharAt(1,'A');
        System.out.println(sb);
    }
}
