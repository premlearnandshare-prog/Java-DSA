package strings;
import java.util.*;
public class Interning {
    public static void main(String[] args){
         String s = "Raghav";
         // Raghav --> Madhav;
//        s.charAt(0) = 'M';  Error
//        s.charAt(2) = 'd';  Error

//        s = "Madhav";
//        System.out.println(s);
//        String t = "Raghav";
//        System.out.println(t);

        // new
        String t = new String("Raghav");
        System.out.println(t);
    }
}
