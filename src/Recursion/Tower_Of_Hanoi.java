package Recursion;

import java.util.Scanner;

public class Tower_Of_Hanoi {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         hanoi(n,'A','B','C');
    }
    public static void hanoi(int n,char a,char b,char c){
        if (n == 0) return;
        // n - 1 disk from A to B via C
        hanoi(n - 1,a,c,b);

        // largest disk from A to C
        System.out.println(a + "-->" + c);

        // n - 1 disk from B to C via A
        hanoi(n - 1,b,a,c);
    }
}
