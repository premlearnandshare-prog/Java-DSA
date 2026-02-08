package String_Prem_Prectice;

import java.util.Scanner;

public class Compare_To_Method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
         String s1 = sc.nextLine();
        System.out.println("Enter Second String: ");
         String s2 = sc.nextLine();

        System.out.println( s1.compareTo(s2) );
    }
}
