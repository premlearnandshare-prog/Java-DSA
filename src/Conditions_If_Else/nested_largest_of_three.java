package Conditions_If_Else;

import java.util.Scanner;

public class nested_largest_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        //nested conditions
        if(a>b){
            if(a>c){
                System.out.println("The largest number is "+a);
            }
            // b<a<c
            else{// a<c
                System.out.println("The largest number is "+c);
            }
        }
        else{ // a<b
            if(b>c){
                System.out.println("The largest number is "+b);
            }
            // a<b<c
            else{// b<c
                System.out.println("The largest number is "+c);
            }
        }



    }

}
