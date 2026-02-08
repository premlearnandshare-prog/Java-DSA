package Conditions_If_Else;
import java.util.EventListener;
import java.util.Scanner;
public class Ternary_Operator_Basics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
//        if (n%2 == 0) System.out.println("Even");
//        else System.out.println("Odd");
        // condition ? sach : jhoot
        System.out.println((n%2 == 0) ? "Even" : "Odd");
        System.out.println(n + " " + ((n%2 == 0) ? "Even" : "Odd"));
    }
}
