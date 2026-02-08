package Recursion;
import java.util.Scanner;
public class Power_Linner {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
         int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();
        System.out.println(a + " raised to the power " + b + " is " + power(a,b));
    }
    public static int power(int a,int b){  // T.C. --> O(b)
        if (a == 0 && b == 0) {
            System.out.println("not defined");
            return -1;
        }
         if (b == 0) return 1;
         int ans = a * power(a,b-1);
         return ans;
    }


}
