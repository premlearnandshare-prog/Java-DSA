package Conditions_If_Else;
import java.util.Scanner;
public class Take_RealNumber_And_cheak_It_Is_Integer_Or_Not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = sc.nextDouble(); //n = 3.149 // n = 10
        int x = (int)n;// x = 3 // n = 10
        //n - x = 0.149 // n - x = 0
        if (n - x > 0){
            System.out.println("Not an integer");
        }
        else {
            System.out.println("Not an integer");
        }
    }
}
