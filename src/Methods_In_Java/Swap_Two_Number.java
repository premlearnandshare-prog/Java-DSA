package Methods_In_Java;
import java.util.Scanner;
public class Swap_Two_Number {
    public static void swap(int a,int b){
        Scanner sc = new Scanner(System.in);
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp;
        System.out.println(x+" "+y);
        swap(x,y);

        System.out.println(x+" "+y);


    }
}
