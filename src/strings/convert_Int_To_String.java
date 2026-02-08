package strings;
import java.util.*;
public class convert_Int_To_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
         int n = sc.nextInt();
         String s = "" + n;
        System.out.println(s);
    }
}
