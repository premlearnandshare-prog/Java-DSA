package Conditions_If_Else;
import java.util.Scanner;
public class Ternary_in_Variables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        // condition ? sach : jhoot
        int parsoon = (n>=0) ? 100 : 0;
        System.out.println(parsoon);
    }
}
