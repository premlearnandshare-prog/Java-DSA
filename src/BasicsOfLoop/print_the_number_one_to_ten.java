package BasicsOfLoop;

import java.util.Scanner;

public class print_the_number_one_to_ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
