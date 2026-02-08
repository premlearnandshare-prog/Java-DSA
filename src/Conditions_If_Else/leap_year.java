package Conditions_If_Else;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        //user input
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the year");
        int n=sc.nextInt();
        //leap year check using condition
        if ((n%4==0&&n%100!=0)||(n%400==0)){
            System.out.println(n + " is a leap year");
        }
        else{
            System.out.println(n + " is not a leap year");
        }
    }
}
