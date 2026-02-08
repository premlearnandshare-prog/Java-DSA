package strings;

import java.util.*;

public class Total_Number_Of_Digit_Without_Using_Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
//         String s = "";
//        s += n;
       String s = Integer.toString(n);
        System.out.println(s.length());

    }
}
