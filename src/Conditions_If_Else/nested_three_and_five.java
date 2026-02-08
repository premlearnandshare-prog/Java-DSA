package Conditions_If_Else;

import java.util.Scanner;

public class nested_three_and_five {
    public static void main(String[] args) {
        // this code is currect --> method number 1
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n=sc.nextInt();
//        if(n%5==0 && n%3==0){
//            System.out.println("the given number is divisible by 5 and 3");
//        }
//        else {
//            System.out.println("the given number is not divisible by 5 and 3");
//        }
        // this code is currect --> method number 2
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        //nested conditions
        if(n%5==0){
            if (n%3==0){
                System.out.println("the given number is divisible by 5 and 3");
            }
            else{
                System.out.println("the given number is not divisible by 5 and 3");
            }
        }
        else{
            System.out.println("the given number is not divisible by 5 and 3");
        }
    }
}



