package Advance_Sorting;

public class Quicksort {
    public static void swap(int[]arr,int i,  int j){
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
    public static void main(String[] args){
         int[]arr = {5,76,3,7,3,7,3};
         int n = arr.length;
         print(arr);
         Quicksort(arr,0,n - 1);
         print(arr);
    }
    public static void Quicksort(int[]arr, int start, int end){
         if (start >= end) return;
         int pivot_Index = partition(arr,start,end);
         Quicksort(arr,start,pivot_Index - 1);
         Quicksort(arr,pivot_Index + 1,end);
    }
    public static int partition(int[]arr,int start,int end){
         int position = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] <= arr[end]){
                swap(arr,i,position);
                position++;
            }
        }
        return position - 1;
    }
}
