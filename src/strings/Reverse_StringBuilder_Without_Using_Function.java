package strings;
import java.util.Scanner;
public class Reverse_StringBuilder_Without_Using_Function {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder rev = new StringBuilder();

        for (int i = sb.length() - 1; i >= 0; i--) {
            rev.append(sb.charAt(i));
        }
        System.out.println("Original " + sb);
        System.out.println("Reverse " + rev);
    }
}
