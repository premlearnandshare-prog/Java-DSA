package Prem_Prectice_Sorting;

import java.util.Scanner;

public class Bubble_Sort_Three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int[]arr = new int[n];
         n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x = 0; x < n - 1; x++) {
            boolean flag = true;  // true --> sorted
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i+1]){
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
