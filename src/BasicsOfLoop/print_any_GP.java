package BasicsOfLoop;

import java.util.Scanner;

public class print_any_GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term");
        int a = sc.nextInt();// First term
        System.out.println("Enter the Common ratio");
        int r = sc.nextInt();       // Common ratio
        System.out.println("Enter the Number of terms");
        int n = sc.nextInt();       // Number of terms
        for (int i = 0; i < n; i++) {
            int term = a * (int) Math.pow(r, i);
            System.out.print(term + " ");
        }
    }
}
