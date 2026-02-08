package Conditions_If_Else;
import java.util.Scanner;
public class area_perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth ");
        int b=sc.nextInt();
        int a = l*b;
        System.out.println("The area of the circle is "+a);
        int p = 2*(l+b);
        System.out.println("The perimeter of the circle is "+p);
        if (a>p){
            System.out.println("The area is greater than the perimeter ");
        }
        else if (a<p){
            System.out.println("The area is less than the perimeter ");
        }
        else {
            System.out.println("The area and perimeter both are equal ");
        }

    }
}
