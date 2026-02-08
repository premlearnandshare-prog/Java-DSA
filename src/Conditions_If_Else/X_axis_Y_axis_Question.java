package Conditions_If_Else;
import java.util.Scanner;
public class X_axis_Y_axis_Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Points: ");
        int x = sc.nextInt();
        System.out.print("Enter second Points: ");
        int y = sc.nextInt();
        if(x == 0 && y == 0) System.out.println("Origin");
        else if (x != 0 && y == 0) System.out.println("X-axis");
        else if (x == 0 && y != 0) System.out.println("Y-axis");
        else if (x > 0 && y > 0) System.out.println("1-st Quadrant");
        else if (x < 0 && y > 0) System.out.println("2-st Quadrant");
        else if (x < 0 && y < 0) System.out.println("3-st Quadrant");
        else    System.out.println("4-st Quadrant");

    }

}
