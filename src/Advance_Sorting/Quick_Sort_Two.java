package Advance_Sorting;

public class Quick_Sort_Two {
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
         int[]arr = {5,4,3,2,1,0,-2};
         int n = arr.length;
         print(arr);
         Quicksort(arr, 0,n - 1);
         print(arr);
    }
    public static void Quicksort(int[]arr,int start, int end){
         if (start >= end) return; // Base case

        int pivot_index = partition(arr,start, end);

        // recursion magic
        // Left
        Quicksort(arr,start,pivot_index - 1);
        // right
        Quicksort(arr,pivot_index + 1,end);

    }
    public static int partition(int[]arr,int start,int end){
        int pos = start;
        for(int i = start ; i <= end ; i++ ){
            if(arr[i] <= arr[end]){
                // swap(arr[i] and arr[pos])
                swap(arr,i,pos);
                pos++;
            }

        }
        return pos - 1;
    }
}
