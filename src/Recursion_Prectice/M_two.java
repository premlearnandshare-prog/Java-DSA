package Recursion_Prectice;
import java.util.Scanner;
public class M_two {
    static int n;
    public static void print(int x){
        if (x > n) return;
        System.out.println(x);
        print(x + 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1);
    }
}
