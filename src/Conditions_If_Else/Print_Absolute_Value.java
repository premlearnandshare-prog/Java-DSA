package Conditions_If_Else;
import java.util.Scanner;
public class Print_Absolute_Value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("The absolute value of given number is: " + (-1)*n);
        }
        else {
            System.out.println("The absolute value of given number is: " + n);
        }
    }
}
