package Recursion;

import java.util.Scanner;

public class array_Traversal_Using_Recursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         n = arr.length;
         int i = 0;
//         // for each loop --> iterative code
//         for(int ele: arr){
//         System.out.print(ele + " ");
//         }
//         System.out.println();

        // for loop --> iterative code
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        print(arr,i,n);
    }
    public static void print(int[]arr,int i,  int n){
        if (i >= n) return;
        System.out.print(arr[i] + " ");
        print(arr,i + 1, n);
    }
}
