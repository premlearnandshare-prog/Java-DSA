package String_Prem_Prectice;

import java.util.Scanner;

public class count_Digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

//         int count = 0;
//         while (n != 0){
//             n/= 10;  // n = n/10
//             count++;
//         }
//        System.out.println(count);

        // without using loop
        String s = "" + n;
        System.out.println(s.length());
    }
}
