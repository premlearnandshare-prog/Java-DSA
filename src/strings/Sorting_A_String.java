package strings;

import java.util.Arrays;

public class Sorting_A_String {
    public static void main(String[] args){
         String s = "raghav";
//         char[] ch  ={'a','z','d','g','f'};
        char[] ch  = s.toCharArray(); // string ek ch array me store ho gyi
         for(char ele: ch){
         System.out.print(ele);
         }
         System.out.println();

        Arrays.sort(ch);

        for(char ele: ch){
            System.out.print(ele);
        }
        System.out.println();
    }
}
