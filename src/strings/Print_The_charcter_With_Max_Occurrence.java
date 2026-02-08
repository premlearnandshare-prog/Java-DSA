package strings;

import java.util.Scanner;

public class Print_The_charcter_With_Max_Occurrence {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String s = sc.next();

       // Step 1 -> khali 26 size ka array banao
       int [] arr = new int[26];
       // 0 -> a , 1 -> b, 2 -> c, 3 -> d ........... 25 -> z

       // step 2 -> loop se String me traveling kro
       for (int i = 0; i < s.length(); i++) {
           //  ch me String ke sabhi character ko store karo
            char ch = s.charAt(i);
            // index nialo
            int index = (int)ch - 97;
            arr[index] =  arr[index] + 1;
       }

       // Step 3 -> maximum nikalo
       int max = Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] > max){
               max = arr[i];
           }
       }
       // Step 4 -> max value ko charecter me badlo
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == max){
              char ch = (char)(i + 97);
               System.out.print(ch + " ");
               System.out.println(arr[i] + " ");
           }
       }
   }

}
