package strings;

import java.util.Scanner;

public class String_Isomorphic_Yes_Or_No {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean result = IsIsomorphic(s,t);
        System.out.println(result);
    }

    public static boolean IsIsomorphic (String s, String t){
        // Step 1 --> 128 size ka character array banao
        char[] c1 = new char[128];

        // Step 2 --> travel in s String
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);

            // step 3 -> index nikalo
            int index = (int)ch;

            // Step 4 --> condition apply
            if (c1[index] == '\0')  {
                c1[index] = dh;
            }
            else{ // c1[index] != '\0'
                if (c1[index] != dh){
                    return false;
                }
            }
        }


        // Step 1 --> 128 size ka character array banao
        char[] c2 = new char[128];

        // Step 2 --> travel in s String
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);

            // step 3 -> index nikalo
            int index = (int)ch;

            // Step 4 --> condition apply
            if (c2[index] == '\0')  {
                c2[index] = dh;
            }
            else{ // c2[index] != '\0'
                if (c2[index] != dh){
                    return false;
                }
            }
        }

        return true;

    }
}
