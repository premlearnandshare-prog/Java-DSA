package Conditions_If_Else;

import java.util.Scanner;

public class largest_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        if (a>b && a>c) { // a is max
            System.out.println("The largest number is "+a);
        }
        else if (b>a && b>c) { // b is max
            System.out.println("The largest number is "+b);
        }
        else if (c>a && c>b) { // c is max
            System.out.println("The largest number is "+c);
        }
    }
}
