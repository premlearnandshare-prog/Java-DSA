package Recursion_Prectice;

import java.util.Scanner;

public class Maze_Path {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(maze(1,1,n));
    }
    public static int maze(int row,int col,int n){
        if (row == n || col == n) return 1; // Base case
        int right_ways = maze(row,col + 1, n); // call
        int down_ways = maze(row + 1,col, n); // call
        int ans = right_ways + down_ways;
        return ans;
    }
}
