package Conditions_If_Else;
import java.util.Scanner;
public class absolute_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer number");
        int n=sc.nextInt();
        if(n<0) {
            System.out.println("The absolute value is: "+ n*(-1));
        }
        else {
            System.out.println("The absolute value is: "+ n);
        }
    }
}
