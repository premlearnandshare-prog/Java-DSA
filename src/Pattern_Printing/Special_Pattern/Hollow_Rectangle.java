package Pattern_Printing.Special_Pattern;
import java.util.Scanner;
public class Hollow_Rectangle {
    public static void main(String[] args) {
        int rows = 5;  // rectangle ki height
        int cols = 10; // rectangle ki width

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Border condition
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // andar space
                }
            }
            System.out.println();
        }
    }

}
