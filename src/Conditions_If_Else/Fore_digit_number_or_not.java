package Conditions_If_Else;
import java.util.Scanner;
public class Fore_digit_number_or_not {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int n = sc.nextInt();
            if (n >999 && n < 10000) System.out.println("The given number " + n + "is 4 digit number");

            else System.out.println("The given number " + n + "is not 4 digit number");
        }
}
