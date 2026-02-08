package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Valid_Anagram_Problem {
    // Leetcode 242
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
        String t = sc.nextLine();

        boolean result = isAnagram(s,t);
        System.out.println("Anagram " + result);
    }

    public static boolean isAnagram (String s , String t){


        char [] a = s.toCharArray();
        char [] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        // Step 1 -->  Length check
        if (s.length() != t.length())  return false;

        // step 2 --> sorted array check Equal or not Equal
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }
}
