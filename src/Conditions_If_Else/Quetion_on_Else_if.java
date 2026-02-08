package Conditions_If_Else;
import java.util.Scanner;
public class Quetion_on_Else_if {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if (n % 5 == 0 && n %3 == 0) System.out.println("The given number " + n + " is divisible by 5 and 3");
        else if (n % 5 == 0) System.out.println("The given number " + n + " is divisible by 5");
        else if (n %3 == 0) System.out.println("The given number " + n + " is divisible by 3");
        else  System.out.println("The given number " + n + " is divisible by 5 OR 3");

    }
}
