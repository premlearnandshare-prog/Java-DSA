package String_Prem_Prectice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";

        // anagram            nagaram
        //  |                    |
        //  |      sort          |   sort
        //aaagmnr      ==      aaagmnr             <--> valid Anagram

        char[] arr = s.toCharArray();
        char[] brr = t.toCharArray();

        // sort array
        Arrays.sort(arr);
        Arrays.sort(brr);

        // cheak length;
        if (s.length() != t.length()){
            System.out.println("Invalid Anagram");
        }
        for (int i = 0; i < t.length(); i++) {
            // check  sorted array equal or not
            if (arr[i] == brr[i]) {
                System.out.println("valid Anagram"); break;
            }
            else{ // (arr[i] != brr[i])
                System.out.println("Invalid Anagram"); break;
            }

        }



    }
}
