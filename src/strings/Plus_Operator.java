package strings;
import java.util.*; // --> import All
public class Plus_Operator {
    public static void main(String[] args){
         String s = "abc";
         // String + String
//         s = s.concat("xyz");
        String a = "def";
        s += a; // s = s + a
//        s = s + "def";

        System.out.println(s);

        // String + char

        String t = "Prem";
        t += 'h';  // t = t + 'h'
        System.out.println(t);

        // String + int

        String st = "Hi i am Ben ";
        st += 10;
        System.out.println(st);

        System.out.println("abc" + 10 + 20); // output = abc1020
        // why? Answer left to right and bondmas rule

        System.out.println("abc" + (10 + 20)); // output = abc30
    }
}
