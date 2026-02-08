package BasicsOfLoop;

import java.util.Scanner;

public class print_Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //print --> 4,7,10,13,16........... (3n+1)
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 4; i <= (3*n+1); i+=3) {
            System.out.println(i + " ");
        }
    }
}
