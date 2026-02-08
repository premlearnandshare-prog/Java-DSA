package Conditions_If_Else;
import java.util.Scanner;
public class Area_of_Rectangle_is_greater_then_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        int b = sc.nextInt();
        int A = 2 * (l+b);
        int P = l * b;
        if (A>P) System.out.println("Area of a Rectangle " + A + " is greater then perimeter " + P);
        else System.out.println("perimeter of a Rectangle " + P + " is greater then Area " + A);
    }
}
