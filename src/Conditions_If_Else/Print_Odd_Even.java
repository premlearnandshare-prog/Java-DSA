package Conditions_If_Else;
import java.util.Scanner;
public class Print_Odd_Even {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("Given Number " + n +" is Even");
        }
//        if (n % 2 != 0){
        else {
            System.out.println("Given Number " + n +" is Odd");
        }
    }
}
