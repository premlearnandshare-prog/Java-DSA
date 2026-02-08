package strings;

import java.util.Arrays;

public class Sorting_A_StringBuilder {
    public static void main(String[] args){
         StringBuilder sb = new StringBuilder("raghav");
         char[] ch = sb.toString().toCharArray();

        Arrays.sort(ch);

        for(char ele: ch){
            System.out.print(ele);
        }
        System.out.println();
    }
}
