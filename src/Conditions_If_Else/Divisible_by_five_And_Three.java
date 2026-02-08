package Conditions_If_Else;
import java.util.Scanner;
public class Divisible_by_five_And_Three {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int n = sc.nextInt();
            if (n % 5 == 0 && n %3 == 0) System.out.println("The given number " + n + "is divisible by 5 and 3");
            else System.out.println("The given number " + n + "is not divisible by 5 and 3");
        }
}
