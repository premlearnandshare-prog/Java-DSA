package Advance_Sorting;

import java.util.Scanner;

public class Marge_sort {
    public static void print(int[] arr){
         for(int ele: arr){
         System.out.print(ele + " ");
         }
         System.out.println();
    }
    public static void marge(int[]a, int[]b, int[]c){
        int m = a.length;
        int n = b.length;
        int o = c.length;

        int i = 0, j = 0, k = 0;
        while (i < m && j < n){
            if (a[i] <= b[j]){
                c[k] = a[i];
                i++; k++;
            }
            else if (a[i] > b[j]){
                c[k] = b[j];
                j++; k++;
            }
            if (i == m && j < n){
                while (j < n){
                    c[k] = b[j];
                    j++; k++;
                }
            }
            if (j == n && i < m){
                while (i < m){
                    c[k] = a[i];
                    i++; k++;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         print(arr);
         margesort(arr);
        print(arr);
    }
    public static void margesort(int[] arr){
         int n = arr.length;
         if (n == 1) return; // base case

         // step 1 --> create two n/2 and n - n/2 size array
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];

        // step 2 --> fill the array to element (copy pasting)
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n - n/2; i++) {
            b[i] = arr[i + n/2];
        }
        // step 3 --> Recursion magic
        margesort(a);
        margesort(b);
        // step 4 --> marge two sorted array
        marge(a,b,arr);
        // step 5 delete array a and b
        a = null;
        b = null;
    }
}
