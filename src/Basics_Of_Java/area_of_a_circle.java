package JavaInput;
import java.util.Scanner;
public class area_of_a_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r=sc.nextDouble();
        double pi = 3.14;
        double a = pi*r*r;
        System.out.println("The area of the circle is "+a);
    }
}
