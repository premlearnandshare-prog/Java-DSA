package Advance_Sorting;

import java.util.Scanner;

public class Quick_sort_Algorithm {
    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr [i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[]arr,int lo, int hi){
         int pivot = arr[lo];
         int smallercount = 0;
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot){
                smallercount++;
            }
        }
        int pivotindex = lo + smallercount;
        // swap arr[pivot index] and arr[current index]
        swap(arr,lo,pivotindex);
        // partition
        int i = lo, j = hi;
        while (i < pivotindex && j > pivotindex){
            if (arr[i] <= pivot) i++;
           else if (arr[j] > pivot) j--;
           else {
                swap(arr, i,j);
                i++;
                j--;
            }
        }
        return pivotindex;
    }
    public static void print(int[]arr){
        for(int ele: arr){
        System.out.print(ele + " ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int[]arr = new int[n];
         n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         print(arr);
         Quicksort(arr,0,n - 1);
        print(arr);
    }
    public static void Quicksort(int[]arr,int lo,int hi){
        if (lo >= hi) return;
         // step 1 --> pivot nikalo (arr[lo] ko sahi location per rakho)
         // & left < pivot < right
        int idx = partition(arr,lo,hi);
        // magic
        Quicksort(arr,lo,idx - 1);
        Quicksort(arr,idx + 1, hi);

    }
}
