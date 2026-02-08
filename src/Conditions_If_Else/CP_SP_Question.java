package Conditions_If_Else;
import java.util.Scanner;
public class CP_SP_Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost price: ");
        int CP = sc.nextInt();
        System.out.print("Enter the Selling price: ");
        int SP = sc.nextInt();
        if (CP > SP) System.out.println("The loss is: " + (CP - SP) );
        else if (CP < SP)System.out.println("The profit is: " + (SP - CP));
        else // cp = sp
            System.out.println("No profit and No loss");
    }
}
