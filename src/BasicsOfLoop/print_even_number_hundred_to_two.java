package BasicsOfLoop;

import java.util.Scanner;

public class print_even_number_hundred_to_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        // method 1
        // even number
        for (int i = n; i >= 2; i-=2) {
            System.out.println(i);
        }
    }
}
