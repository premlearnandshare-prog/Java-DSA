package Conditions_If_Else;

import java.util.Scanner;
public class Gretest_Of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter third Number: ");
        int c = sc.nextInt();
        if (a>b){
            if (a>c) System.out.println(a + " is greatest");
            else //b<a<c
                System.out.println(c + " is greatest");
        }
        else{ //b>a
            if (b>c) System.out.println(b + " is greatest");
            else //a<b<c
                System.out.println(c + " is greatest");
        }
    }
}
