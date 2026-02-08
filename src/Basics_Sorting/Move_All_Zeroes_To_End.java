package Basics_Sorting;

import java.util.Scanner;

public class Move_All_Zeroes_To_End {
    public static void main(String[] args){
       int[]arr = {1,0,-2,3,0,4,8,0,10,0,12};
       int n = arr.length;
        for (int x = 0; x < n - 1; x++) {
            boolean flag = true;  // true --> sorted
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] == 0){
                    swap(arr,i,i+1);
                    flag = false;
                }
            }
            if (flag == true) break;
        }
        print(arr);
    }
    public static void swap(int[]arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[]arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
