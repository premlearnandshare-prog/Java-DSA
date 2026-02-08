package Conditions_If_Else;

import java.util.Scanner;

public class MCQ_in_nested_condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        if(n%5==0 || n%3==0){
            if(n%15!=0){
                System.out.println("The number is divisible by 5 or 3 but not divisible by 15");
            }
            else{
                System.out.println("Not matching the required condition");
            }
        }
        else{
            System.out.println("Not matching the required condition");
        }

    }

}
