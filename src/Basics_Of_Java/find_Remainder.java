package JavaInput;
import java.util.Scanner;
public class find_Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend: ");//jisko devide karna hai
        int a=sc.nextInt();
        System.out.println("Enter the divisor: ");//jisse devide karna hai
        int b=sc.nextInt();
        int q =a/b;
        int r= a-(b*q);
        System.out.println("The remainder when "+a + " is divided by" + b+" is: "+r);


    }
}
