package Recursion;

import java.util.Scanner;

public class Maze_path {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
         int n = sc.nextInt();
        System.out.println(maze(1,1,m,n));
    }
    public static int maze(int row, int cols, int m, int n){
        if (row == m || cols == n) return 1;
        int rightWays = maze(row, cols + 1, m,n);
        int downWays = maze(row + 1, cols, m,n);
        return rightWays + downWays;
    }
}
