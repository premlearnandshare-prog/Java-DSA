package Advance_Sorting;

import java.util.Scanner;

public class kth_largest_element_using_Quick_select_Algo {
    static int ans;
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
         n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
        int k = sc.nextInt();
        ans = -1;
        Quickselect(arr, 0,n - 1,n - k + 1);
        System.out.println(ans);
    }
    public static void Quickselect(int[]arr,int start, int end, int k){
        if (start >= end) return; // Base case

        int pivot_index = partition(arr,start, end);

        if (pivot_index == k - 1){
            ans = arr[pivot_index];
            return;
        }
        // recursion magic
        // Left
        if (k - 1 < pivot_index) Quickselect(arr,start,pivot_index - 1, k);
            // right
        else Quickselect(arr,pivot_index + 1,end,k);

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
