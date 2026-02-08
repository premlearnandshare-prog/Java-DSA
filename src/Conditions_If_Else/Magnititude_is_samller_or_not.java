package Conditions_If_Else;
import java.util.Scanner;
public class Magnititude_is_samller_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("The absolute value of given number is: " + (-1)*n);
            if ((-1)*n < 69){
                System.out.println(" Magnititude is samller then 69");
            }
            else if ((-1)*n > 69){
                System.out.println(" Magnititude is not samller then 69");
            }
        }
        else {// n > 0
            System.out.println("The absolute value of given number is: " + n);
            if (n < 69) System.out.println(" Magnititude is samller then 69");
            else if (n > 69) System.out.println(" Magnititude is not samller then 69");
        }

    }
}
