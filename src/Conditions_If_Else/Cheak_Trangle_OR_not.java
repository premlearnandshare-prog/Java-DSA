package Conditions_If_Else;
import java.util.Scanner;
public class Cheak_Trangle_OR_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side of trangle: ");
        int a = sc.nextInt();
        System.out.print("Enter second side of trangle: ");
        int b = sc.nextInt();
        System.out.print("Enter third side of trangle: ");
        int c = sc.nextInt();
        if (a+b >c && a+c >b && b+c >a){
            System.out.println("valid Trangle");
        }
        else System.out.println("Invalid Trangle");
    }
}
